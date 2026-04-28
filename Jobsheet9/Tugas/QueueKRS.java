package Jobsheet9.Tugas;

public class QueueKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahDilayani;
    final int totalMaksimal = 30;

    public QueueKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
        sudahDilayani = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }
    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }
     public Mahasiswa dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }

        Mahasiswa mhs = data[front];
        size--;

        if (size == 0) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        return mhs;
    }
    public void panggilDuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        int jumlahPanggil = (size < 2) ? size : 2;

        for (int i = 1; i <= jumlahPanggil; i++) {
            Mahasiswa mhs = dequeue();
            System.out.println("\nMahasiswa ke-" + i + " diproses:");
            mhs.tampilInformasi();
            sudahDilayani++;
        }
    }
     public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Daftar Antrian:");
        int i = front;
        int no = 1;
        while (true) {
            System.out.println("Antrian ke-" + no);
            data[i].tampilInformasi();
            System.out.println();

            if (i == rear) break;
            i = (i + 1) % max;
            no++;
        }
    }
    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan:");
            data[front].tampilInformasi();
        }
    }
    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\nAntrian paling akhir:");
            data[rear].tampilInformasi();
        }
    }
    public void tampilDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        int jumlah = Math.min(2, size);
        int i = front;

        for (int j = 1; j <= jumlah; j++) {
            System.out.println("Antrian terdepan ke-" + j + ":");
            data[i].tampilInformasi();
            i = (i + 1) % max;
        }
    }
     public int jumlahAntrian() {
        return size;
    }

    public int jumlahSudahDilayani() {
        return sudahDilayani;
    }

    public int jumlahBelumDilayani() {
        return totalMaksimal - sudahDilayani;
    }
}


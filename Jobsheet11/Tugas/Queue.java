package Jobsheet11.Tugas;


public class Queue {
    Node front;
    Node rear;
    int size;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa mhs) {
        Node newNode = new Node(mhs, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Data masuk antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.print("Memanggil: ");
        front.data.tampil();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        Node temp = front;
        System.out.println("Isi antrian:");
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }

    public void size() {
        System.out.println("Jumlah antrian: " + size);
    }
}


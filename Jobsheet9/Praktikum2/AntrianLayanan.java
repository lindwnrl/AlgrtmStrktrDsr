package Jobsheet9.Praktikum2;

public class AntrianLayanan {
    
    Mahasiswa [] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int max){
        this.max =max;
        this.data = new Mahasiswa[max];
        this.size =0;
        this.rear = -1;
        this.front = 0; 
    }
    boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public void tambahAntrian(Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian sudah penuh,tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");

    }
    public Mahasiswa layaniMahasiswa(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        }else{
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            return mhs;
        }
}
    void lihatTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            System.out.println("Mahasiswa Terdepan : ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[front].tampilkanData();
        }
    }
    void lihatTerbelakang(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            System.out.println("Mahasiswa Terdepan : ");
            System.out.println("NIM - Nama - Prodi - Kelas");
            data[rear].tampilkanData();
        }
    }
    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian : ");
        System.out.println("NIM - Nama - Kelas - Prodi");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public int getJumlahAntrian(){
        return size;
    }
    void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

}



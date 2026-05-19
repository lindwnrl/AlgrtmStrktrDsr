package Jobsheet12;
public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;


    public DoubleLinkedList17(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Mahasiswa17 data){
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        }else {
            newNode.next =head;
            head.prev = newNode;
            head = newNode;
        }
        
    }
    public void addLast(Mahasiswa17 data){
            Node17 newNode = new Node17(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
    public void insertAfter(String keyNim,Mahasiswa17 data){
        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node17 newNode = new Node17(data);

        if (current == tail) {
            newNode.prev =current;
            current.next =newNode;
            tail = newNode;
        }else{
            newNode.prev = current;
            newNode.next =current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM "+ keyNim);
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node17 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
        public void printReverse(){
            if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node17 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
        }
     public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return;
        }else {
            Mahasiswa17 dataHapus = head.data;
        
        if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus");
        dataHapus.tampil();
        }
    }
    public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong, tidak dapat dihapus!");
    } else {

        Mahasiswa17 dataHapus = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Data berhasil dihapus:");
        dataHapus.tampil();
    }
}
}

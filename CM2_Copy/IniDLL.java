package CM2_Copy;

import Jobsheet12.Node17;

public class IniDLL {
    IniNode head;
    IniNode tail;
    int nomorPesanan = 1;
    Pesanan pesanan;
    public IniDLL(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public boolean prioritas(){
        return false;
    }

    public void insertAfter(int keyNomer,Pembeli data){
        IniNode current = head;
        // while (current != null && !current.data.noPesanan.equals(keyNomer)) {
        //     current = current.next;
        // }
        // if (current == null) {
        //     System.out.println("Data dengan Nomor " + nomorPesanan + " tidak ditemukan.");
        //     return;
        // }
        IniNode newNode = new IniNode(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }else{
            newNode.prev = current;
            newNode.next =current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah nomor "+ nomorPesanan);
    }

    public void add(Pembeli data){

        data.noPesanan = nomorPesanan;
        nomorPesanan++;

        IniNode newNode = new IniNode(data);

        if (isEmpty()) {
            head = tail = newNode;
        }else {
            tail.next =newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor : " + data.noPesanan);
        
}
public void print(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        } System.out.println( "No.Pesanan  |  Nama    |  No.Hp  ");

        IniNode current = head;
        while (current != null) {
           
            current.data.tampilPembeli();
            current = current.next;
        }
    }
    public Pembeli remove(){
        
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
            return null;
        }
           Pembeli data = head.data;
    
        if (head == tail) {
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
        return data; 
       
        }
    }
    


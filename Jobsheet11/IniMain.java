package Jobsheet11;

import java.util.Scanner;

public class IniMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList sll = new SingleLinkedList();

    sll.print();
    System.out.print("Nama : ");
    String nama = sc.nextLine();
    System.out.print("NIM : ");
    String nim = sc.nextLine();
    System.out.print("Kelas : ");
    String kelas = sc.nextLine();
    System.out.print("IPK : ");
    double ipk = sc.nextDouble();
    sc.nextLine();
    Mahasiswa17 mhs1 = new Mahasiswa17(nama, nim, kelas, ipk);
    sll.addFirst(mhs1);
    sll.print();

    System.out.print("Nama : ");
    nama = sc.nextLine();
    System.out.print("NIM : ");
    nim = sc.nextLine();
    System.out.print("Kelas : ");
    kelas = sc.nextLine();
    System.out.print("IPK : ");
    ipk = sc.nextDouble();
    sc.nextLine();
    Mahasiswa17 mhs2 = new Mahasiswa17(nama, nim, kelas, ipk);
    sll.addLast(mhs2);
    sll.print();

    System.out.print("Nama : ");
    nama = sc.nextLine();
    System.out.print("NIM : ");
    nim = sc.nextLine();
    System.out.print("Kelas : ");
    kelas = sc.nextLine();
    System.out.print("IPK : ");
    ipk = sc.nextDouble();
    sc.nextLine();
    Mahasiswa17 mhs3 = new Mahasiswa17(nama, nim, kelas, ipk);
    sll.insertAfter("Z",mhs3);
    sll.print();
    
    System.out.print("Nama : ");
    nama = sc.nextLine();
    System.out.print("NIM : ");
    nim = sc.nextLine();
    System.out.print("Kelas : ");
    kelas = sc.nextLine();
    System.out.print("IPK : ");
    ipk = sc.nextDouble();
    sc.nextLine();
    Mahasiswa17 mhs4 = new Mahasiswa17(nama, nim, kelas, ipk);
    sll.insertAt(2, mhs4);
    
    System.out.println("data index 1 :");
    sll.getData(1);

    System.out.println("data mahasiswa a/n Z berada pada Index : "+ sll.indexOf("Z"));
    System.out.println();

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();
    
    sll.print();
    sc.close();
    }   
}

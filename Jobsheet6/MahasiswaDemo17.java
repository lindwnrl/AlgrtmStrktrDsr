package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
    MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
    

        for (int i = 0; i < 5; i++) {
            System.out.println("Data Mahasiswa ke-"+ (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            Mahasiswa17 m = new Mahasiswa17(nim,nama,kelas,ipk);
   
            list.tambah(m);
        }


System.out.println("Data mahasiswa sebelum sorting: ");
list.tampil();

System.out.println("Data mahasiswa setelah sorting menggunakan Bubble Sort berdasarkan IPK (Descending) : ");
list.bubbleSort();
list.tampil();

System.out.println("Data mahasiswa setelah sorting menggunakan Selection Sort berdasarkan IPK (Ascending) :");
list.selectionSort();
list.tampil();

System.out.println("Data mahasiswa setelah sorting menggunakan Insertion Sort berdasarkan IPK (Ascending) :");
list.insertionSort();
list.tampil();
}
}

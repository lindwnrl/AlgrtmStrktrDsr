package Jobsheet7;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
        Scanner sc =new Scanner(System.in);
        System.out.println("Masukkan Berapa Mahasiswa yang akan di input : ");
        int z = sc.nextInt();
        int jmlMhs=z;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" +(i+1));
            System.out.print("Nama :");
            String nama = sc.nextLine();
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas=sc.nextLine();
            System.out.print("IPK :");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.print("--------------------------------------------");
            System.out.println();
            list.tambah(new Mahasiswa17(nama,nim,kelas,ipk));
        }
        list.tampil();
        System.out.println("-------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi = list.sequentialSearch(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("Menggunakan Binary Search");
        double posisi2 = list.findBinarySearch(cari, 0, jmlMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        
    }
}

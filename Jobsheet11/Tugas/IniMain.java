package Jobsheet11.Tugas;

import java.util.Scanner;

public class IniMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int pilih;

        do {
            System.out.println("=== MENU ANTRIAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Depan");
            System.out.println("4. Lihat Belakang");
            System.out.println("5. Tampilkan Semua");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, kelas, ipk);
                    q.enqueue(mhs);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peekFront();
                    break;

                case 4:
                    q.peekRear();
                    break;

                case 5:
                    q.print();
                    break;

                case 6:
                    q.size();
                    break;

                case 7:
                    q.clear();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);

        sc.close();
    }
}
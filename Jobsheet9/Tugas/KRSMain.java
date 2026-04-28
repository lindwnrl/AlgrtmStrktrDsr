package Jobsheet9.Tugas;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS antrian = new QueueKRS(10);
        int pilihan;

        do {
            System.out.println("==== ANTRIAN PERSETUJUAN KRS ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses KRS");
            System.out.println("8. Jumlah Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                      case 2:
                    antrian.panggilDuaAntrian();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.tampilDuaTerdepan();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.jumlahAntrian());
                    break;
                     case 7:
                    System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + antrian.jumlahSudahDilayani());
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa yang belum proses KRS: " + antrian.jumlahBelumDilayani());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}


package Jobsheet8;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
    StackTugasMahasiswa17 stack = new StackTugasMahasiswa17(5);
    Scanner sc = new Scanner(System.in);
    int pilihan;
    do {
        System.out.println("\n Menu");
        System.out.println("1. Mengumpulkan Tugas");
        System.out.println("2. Menilai Tugas ");
        System.out.println("3. Melihat Tugas Teratas");
        System.out.println("4. Melihat Daftar Tugas");
        System.out.println("5. Melihat Tugas Terbawah");
        System.out.println("6. Banyak Tugas ");
        System.out.print("Pilihan :");
        pilihan = sc.nextInt();
        sc.nextLine();
        switch (pilihan) {
            case 1:
                System.out.print("Nama : ");
                String nama = sc.nextLine();
                System.out.print("NIM : ");
                String nim = sc.nextLine();
                System.out.print("Kelas : ");
                String kelas = sc.nextLine();
                Mahasiswa17 mhs = new Mahasiswa17(nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan \n",mhs.nama);
                break;
            
            case 2:
                Mahasiswa17 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari "+dinilai.nama);
                    System.out.print("Masukkan nilai (0 - 100) : ");
                    int nilai =sc.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai tugas %s adalah %d \n ",dinilai.nama,nilai);
                    String biner = stack.konversiDesimalKeBiner(nilai);
                    System.out.println("Nilai Biner Tugas : " + biner);
                }
            break;
                case 3:
                    Mahasiswa17 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
            case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\t NIM \t Kelas");
                    stack.print();
                    break;
            case 5:
                Mahasiswa17 tengok =stack.reversePeek();
                if (tengok != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + tengok.nama);
                    }
                    break;
            case 6:
                stack.banyakTugas();
            default:
                System.out.println("Pilihan tidak valid");
            }
        } while (pilihan >= 1 && pilihan <= 6);
        sc.close();
    }
}


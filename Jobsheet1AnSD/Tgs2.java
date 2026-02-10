package Jobsheet1AnSD;

import java.util.Scanner;

public class Tgs2 {

static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);
        tampilSemuaJadwal(jadwal);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        tampilJadwalByHari(jadwal, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = sc.nextLine();
        tampilJadwalByMatkul(jadwal, matkul);
    }

    
    static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang           : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari            : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam             : ");
            jadwal[i][3] = sc.nextLine();
        }
    }


    static void tampilSemuaJadwal(String[][] jadwal) {
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.println("Mata Kuliah | Ruang | Hari | Jam");
        System.out.println("--------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(jadwal[i][j] + " | ");
            }
            System.out.println();
        }
    }


    static void tampilJadwalByHari(String[][] jadwal, String hari) {
        boolean ketemu = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Jadwal tidak ditemukan.");
        }
    }


    static void tampilJadwalByMatkul(String[][] jadwal, String matkul) {
        boolean ketemu = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}

    

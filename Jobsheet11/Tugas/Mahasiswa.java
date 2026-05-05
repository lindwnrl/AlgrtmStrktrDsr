package Jobsheet11.Tugas;

public class Mahasiswa {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(nim + " | " + nama + " | " + kelas + " | " + ipk);
    }
}


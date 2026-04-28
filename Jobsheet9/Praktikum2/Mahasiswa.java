package Jobsheet9.Praktikum2;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa(String nim,String nama,String prodi,String kelas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }
    public void tampilkanData(){
        System.out.print(nim + " - " + nama + " - " + prodi + " - " + kelas + " - ");

    }
}

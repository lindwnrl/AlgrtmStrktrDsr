package Jobsheet12;

public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;


    Mahasiswa17(String nim,String nama,String kelas,double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampil(){
        System.out.println("Nama : "+ nama + " Nim : "+ nim + " Kelas : "+ kelas +  "IPK : " + ipk);
    }
}

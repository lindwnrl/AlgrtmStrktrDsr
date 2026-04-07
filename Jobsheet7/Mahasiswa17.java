package Jobsheet7;

public class Mahasiswa17 {

    String nama;
    String nim;
    String kelas;
    Double ipk;

    Mahasiswa17(){

    }
    Mahasiswa17(String name,String nm,String kls,Double ip){
        nama = name;
        nim = nm;
        kelas =kls;
        ipk = ip;
    }
    void tampilInformasi(){
        System.out.println("Nama  : "+ nama);
        System.out.println("NIM   : "+ nim);
        System.out.println("Kelas : "+ kelas);
        System.out.println("IPK   : "+ ipk);
    }
}
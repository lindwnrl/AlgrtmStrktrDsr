package Jobsheet6;

public class Dosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;
    String n;

    Dosen (String kd,String nm,boolean jk,int age){
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }
    void tampilInformasi (){
        System.out.println("Nama          :" + nama);
        System.out.println("Kode          :" + kode);
        if (jenisKelamin == true) {
            n ="Perempuan";
        }else{
            n = "laki-laki";
        }
        System.out.println("Jenis Kelamin :" + n);
        System.out.println("Usia          :" + usia);
    }
}

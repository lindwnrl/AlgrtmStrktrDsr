package Jobsheet11;

public class Mahasiswa17 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    Mahasiswa17(){

    }
    Mahasiswa17(String nama,String nim,String kelas,double ipk){
        this.ipk =ipk;
        this.kelas=kelas;
        this.nama=nama;
        this.nim=nim;
    }

    void tampilInformasi(){
        System.out.println(nama + " - " + nim + " - " + kelas + " - " + ipk);
    }
}

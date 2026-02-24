package Jobsheet2;


public class Mahasiswa17 {
        String nim;
        String nama;
        String kelas;
        double ipk;
public Mahasiswa17(String nm,String nim,double ipk,String kls){
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
    
}
    void tampilInformasi(){
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("IPK: "+ ipk);
        System.out.println("Kelas: "+ kelas);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru){
        ipk = ipkBaru;
    }
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kenerja Sangat Baik";
        }else if (ipk >= 3.0) {
            return "Kinerja Baik";
        }else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        }else if (ipk >= 1.0){
            return "Kinerja Kurang";
        }else if (ipk <= 0.0 && ipk <= 4.0) {
            return "IPK tidak valid.Harus antara 0.0 dan 4.0";
        }
    }
}

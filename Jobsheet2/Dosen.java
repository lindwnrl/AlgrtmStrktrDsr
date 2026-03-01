package Jobsheet2;

public class Dosen {
    String nama;
    String idDosen;
    String bidangKeahlian;
    boolean status;
    int tahunBergabung;
    int masaMengabdi;

    public Dosen(String nama,String idDosen,String bidangKeahlian,boolean status,int tahunBergabung){
        this.nama =nama;
        this.idDosen = idDosen;
        this.bidangKeahlian =bidangKeahlian;
        this.status =status;
        this.tahunBergabung = tahunBergabung;
        
        
    }

void tampilInformasi(){
    System.out.println("Nama : " + nama);
    System.out.println("ID Dosen : "+ idDosen);
    System.out.println("Bidang Keahlian : "+ bidangKeahlian);
    System.out.println("Tahun Bergabung : "+ tahunBergabung);
    System.out.println("Masa Mengabdi : "+ masaMengabdi);
    if (status = true) {
        System.out.println("Status : Aktif ");  
    }else {
        System.out.println("Status : Tidak Aktif ");
    }
    
}
void setStatus(boolean status){
    if (status = true) {
        status = true;
    }else{
        status = false;
    }
    
}
int hitungMasaKerja(int tahunIni){
    masaMengabdi = tahunIni - tahunBergabung;
    return masaMengabdi;
    
    
}
void ubahKeahlian(String bidangKeahlianBaru){
    bidangKeahlian = bidangKeahlianBaru;        
}
}

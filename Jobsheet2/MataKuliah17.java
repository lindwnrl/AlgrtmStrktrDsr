package Jobsheet2;

public class MataKuliah17{
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah17(String nm,String koMK,int sks,int jmlJam){
        nama = nm;
        kodeMK = koMK;
        this.sks = sks;
        jumlahJam =jmlJam;
        
    }

void tampilkanInformasi(){
    System.out.println("Nama : " + nama);
    System.out.println("Kode MK : " + kodeMK);
    System.out.println("SKS : " + sks);
    if (jumlahJam <= 0) {
        System.out.println("Pengurangan gagal : harap memasukkan jumlah yang lebih besar dari nol");
    }
    else {
        System.out.println("Jumlah Jam : "+ jumlahJam);

    }
}
void ubahSks(int sksBaru){
sks = sksBaru;
}
void tambahJam(int jam){
jumlahJam += jam;
}
void kurangJam(int jam){
    jumlahJam -= jam;
}
}


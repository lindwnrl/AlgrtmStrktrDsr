package CM1;

public class Peminjaman {
   
    
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat = 0;
    int denda;
    Mahasiswa mhs;
    Buku buku;
   
    
    Peminjaman(Mahasiswa mhs,Buku buku,int lamaPinjam){
        this.lamaPinjam = lamaPinjam;
        this.mhs = mhs;
        this.buku = buku;
        
    }
    void hitungDenda(){
        if (lamaPinjam > 5) {
          denda = (lamaPinjam - batasPinjam) * 2000;
        }else{
            denda = 0;
        }
    }
    void hitungSemuaDenda(){
        for(Peminjaman pj :listPj){
            if (pj != null) {
                pj.hitungDenda();
            }
        }
    }
    void tampilSemuaDenda(){
        for(Peminjaman pj: listPj){
            if (pj != null) {
                pj.tampilDenda();
            }
        }
    }
    void tampilDenda(){
        System.out.println("NIM : " + mhs.nim + " | Nama : " + mhs.nama + " | Judul Buku : " + buku.judul + " | Lama Pinjam : " + lamaPinjam + " | Denda : "+ denda);
    }
    void tampilPeminjaman(){
        System.out.println("NIM : " + mhs.nim + " | Nama : " + mhs.nama + " | Judul Buku : " + buku.judul + " | Lama Pinjam : " + lamaPinjam + " hari");
    }
    Peminjaman [] listPj = new Peminjaman[5];
    int idx;
     void tambahPj (Peminjaman pj){
        if (idx < listPj.length) {
            listPj[idx]=pj;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
     void tampil(){
         System.out.println("Data Peminjaman :");
         for (Peminjaman pj: listPj){
            pj.tampilPeminjaman();
        }
          System.out.println("---------------------------------------------");
    }
    void insertionSortAsc(){
        for (int i = 1; i < listPj.length; i++) {
        Peminjaman temp = listPj [i];
        int j = i;
        
        while (j > 0 && listPj[j - 1].denda < temp.denda) {
            listPj[j] = listPj[j - 1];
            j--;
        }
        
        listPj[j] = temp;
    }
    }
    void tampilSearchByNIM(String cari){
    boolean ketemu = false;

    for (Peminjaman pj : listPj){
        if (pj != null && pj.mhs.nim.equals(cari)){
            pj.hitungDenda();
            System.out.println("NIM   : " + pj.mhs.nim);
            System.out.println("Nama  : " + pj.mhs.nama);
            System.out.println("Buku  : " + pj.buku.judul);
            System.out.println("Lama  : " + pj.lamaPinjam);
            System.out.println("Denda : " + pj.denda);
            System.out.println("----------------------");
            ketemu = true;
        }
    }

    if (!ketemu){
        System.out.println("Data tidak ditemukan");
    }
}
}

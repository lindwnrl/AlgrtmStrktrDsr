package CM1;

public class Buku {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    int idx = 0;

   
    Buku(String kodeBuku,String judul,int tahunTerbit){
        this.kodeBuku =kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    void tampilBuku(){
       
        System.out.println("Kode : "+kodeBuku+" | Judul : "+judul+ " | Tahun : "+tahunTerbit);
    }
    Buku [] listBuku = new Buku[4];
    void tambahBuku (Buku b){
        if (idx < listBuku.length) {
            listBuku[idx]=b;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil(){
         System.out.println("Daftar Buku :");
         for (Buku b : listBuku){
            b.tampilBuku();
        }
         System.out.println("-----------------------------------------------");
    }
}


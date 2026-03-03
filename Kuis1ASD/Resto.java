package Kuis1ASD;

public class Resto {
    String nama;
    String pesan;
    String mensaje;
    String pembayaran;
    int stokRoti = 5;
    int stokKopi = 5;
    int stokTeh = 5;
    int totalStok;
    int stokTerkini;
    int hargaKopi = 8000,hargaTeh = 5000,hargaRoti = 4000;

    public Resto(String nama,String pesan,String pembayaran){
        this.nama = nama;
        this.pesan = pesan;
        this.pembayaran = pembayaran;
    }
    
    void tampilInformasi(){
        System.out.println("Nama         : "+ nama);
        System.out.println("Pesan        : " + pesan);
        if (pembayaran.equalsIgnoreCase("Qris") ||  pembayaran.equalsIgnoreCase("Cash"))  {
            System.out.println("Payment      : "+ pembayaran);
        }else {
            mensaje = "Harap membayar menggunakan Qris / Cash";
            System.out.println("Message      : " + mensaje);
        }

        System.out.println("Stok Terkini : " + stokTerkini);
        System.out.println("=======================");
    }
    void tampilMenu(){
        System.out.println("Harga Kopi : "+hargaKopi);
        System.out.println("Harga Teh  : "+hargaTeh);
        System.out.println("Harga Roti : "+hargaRoti);
        System.out.println("=======================");
    }
    void ubahPesanan(String pesanBaru){
        pesan = pesanBaru;
    }
    int hitungStok (int totalStok){
        if (pesan.equalsIgnoreCase("Kopi")) {
            stokKopi--;
        }else if (pesan.equalsIgnoreCase("Roti")) {
            stokRoti--;
        }else if (pesan.equalsIgnoreCase("Teh")) {
            stokTeh--;
        }
        stokTerkini = stokKopi + stokRoti + stokTeh;
        return stokTerkini;
    }
}


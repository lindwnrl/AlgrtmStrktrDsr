package Kuis1ASD;


public class RestoMain {
    public static void main(String[] args) {
        Resto rst1 =new Resto(null, null, null);
        rst1.nama = "El Bijoss";
        rst1.pesan = "Kopi";
        rst1.pembayaran = "Qris";
        
        rst1.tampilMenu();
        rst1.hitungStok(0);
        rst1.tampilInformasi();

        Resto rst2 = new Resto("Rahmad Hernandez Estrada", "Roti", "Cash");
        rst2.hitungStok(0);
        rst2.ubahPesanan("Kopi");
        rst2.tampilInformasi();

        Resto rst3 = new Resto("La Polla", "Teh", "Daun");
        rst3.hitungStok(0);
        rst3.ubahPesanan("Roti");
        rst3.tampilInformasi();
        }
    }


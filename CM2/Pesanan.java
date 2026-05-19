package CM2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;

    Pesanan(int kodePesanan, String namaPesanan, int harga, String namaPembeli){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }
    public void tampilPesanan(){
        System.out.println(kodePesanan + "       " + namaPesanan + "        " + harga + "        " + namaPembeli);
    }
    
    
}

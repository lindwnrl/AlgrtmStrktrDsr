package CM2;

public class Pembeli {
    String namaPembeli;
    String noHp;
    int noPesanan = 0;
    Pesanan pesanan;

    Pembeli(String namaPembeli, String noHp){
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        
    }

    public void tampilPembeli(){
        System.out.println(noPesanan +".            "+namaPembeli+"           "+ noHp);
    }
    
}

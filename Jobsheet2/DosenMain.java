package Jobsheet2;

public class DosenMain {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen(null, null, null, false, 0);
        dsn1.nama = "Rahmat Fimbrianta";
        dsn1.idDosen = "087492";
        dsn1.bidangKeahlian = "Cyber Security";
        dsn1.tahunBergabung = 2000;
        dsn1.status = true;

        dsn1.setStatus(false);
        dsn1.hitungMasaKerja(2026);
        dsn1.ubahKeahlian("Software Engineer");
        dsn1.tampilInformasi();

        Dosen dsn2 = new Dosen("Rahmad Hernandez Estrada", "6767", "AI Engineer", true, 1997);
        dsn2.hitungMasaKerja(2026);
        dsn2.tampilInformasi();
        
    }
}

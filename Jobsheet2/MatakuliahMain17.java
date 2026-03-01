package Jobsheet2;

public class MatakuliahMain17 {
    public static void main(String[] args) {
        MataKuliah17 mk1 =new MataKuliah17(null, null, 0, 0);
        mk1.nama = "El Pollo";
        mk1.kodeMK = "AL";
        mk1.sks = 4;
        mk1.jumlahJam = 3;

        mk1.tampilkanInformasi();
        System.out.println();
        mk1.kurangJam(2);
        mk1.ubahSks(1);
        mk1.tampilkanInformasi();
        System.out.println();

        MataKuliah17 mk2 = new MataKuliah17("Los Bijos", "Basis Data", 3, 1);
        mk2.ubahSks(2);
        mk2.kurangJam(2);
        mk2.tampilkanInformasi();
    }
}

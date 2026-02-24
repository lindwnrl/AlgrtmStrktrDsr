package Jobsheet2;

public class MahasiswaMain17 {
    public static void main(String[] args) {
        Mahasiswa17 mhs1 = new Mahasiswa17(null, null, 0, null);
        mhs1.nama = "Cassius Clay Farhan";
        mhs1.nim = "224171892";
        mhs1.kelas = "SI 1J";
        mhs1.ipk = 3.55;

        mhs1.tampilInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilInformasi();

        Mahasiswa17 mhs2 = new Mahasiswa17("Annisa Nabila", "2678519", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilInformasi();

        Mahasiswa17 mhsRahmad = new Mahasiswa17("Lindhu Nuril Rahmad", "254107020216", 3.48, "TI 1G");
        mhsRahmad.tampilInformasi();
    }
}

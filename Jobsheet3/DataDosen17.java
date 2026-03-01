package Jobsheet3;

public class DataDosen17 {
    
    static void dataSemuaDosen(Dosen17 [] arrayOfDosen){
        String input = "";
        for (Dosen17 i : arrayOfDosen ){
            System.out.println("Nama            :" + i.nama);
            System.out.println("Kode            :" + i.kode);
            if (i.jenisKelamin == true) {
                input = "Laki laki";
            }else {
                input = "Perempuan";
            }
            System.out.println("Jenis Kelamin   :" + input);
            System.out.println("Usia            :" + i.usia);
            System.out.println("---------------------------");
        }
  }
  static void jumlahDosenPerJenisKelamin (Dosen17 [] arrayOfDosen){
    int lakilaki = 0;
    int perempuan = 0;
    for (int i = 0; i < arrayOfDosen.length; i++) {
        if (arrayOfDosen [i].jenisKelamin == true) {
            lakilaki++;
        }else{
            perempuan++;
        }
    }
    System.out.println("Laki laki : "+ lakilaki);
    System.out.println("Perempuan : "+ perempuan);
  }
  static void rataRataUsiaDosen (Dosen17 [] arrayOfDosen){
    double rataRata = 0;
    rataRata += arrayOfDosen [0].usia + arrayOfDosen [1].usia +arrayOfDosen [2].usia / 3;
    System.out.println("Rata Rata : "+ rataRata);
  }
  static void usiaDosen (Dosen17 [] arrayOfDosen ){
    String input = "";
    Dosen17 Muda = arrayOfDosen[0];
    Dosen17 Tua = arrayOfDosen [0];
    for (int i = 0; i < arrayOfDosen.length; i++) {
        if (arrayOfDosen [i].usia < Muda.usia) {
            Muda = arrayOfDosen[i];
        }
        if (arrayOfDosen [i].usia > Tua.usia) {
            Tua = arrayOfDosen [i];
        }
    }
        System.out.println("=== Dosen paling muda ===");
        System.out.println("Nama          : "+Muda.nama);
        System.out.println("Kode          : "+Muda.kode);
        if (Muda.jenisKelamin == true) {
            input = "Laki laki";
        }else {
            input = "Perempuan";
        }
        System.out.println("Jenis Kelamin : "+ input);
        System.out.println("Usia          : "+Muda.usia);
        System.out.println();
        System.out.println("=== Dosen paling tua ===");
        System.out.println("Nama           : "+Tua.nama);
        System.out.println("Kode           : "+Tua.kode);
        if (Muda.jenisKelamin == true) {
            input = "Laki laki";
        }else {
            input = "Perempuan";
        }
        System.out.println("Jenis Kelamin  : "+input);
        System.out.println("Usia           : "+Tua.usia);
        System.out.println();
  }
}

package Jobsheet3;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Dosen17 [] arrayOfDosen = new Dosen17[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen [i] = new Dosen17(null, null, null, i);
            System.out.println("Masukkan data Dosen ke -"+(i+1));
            System.out.print("Nama : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Kode : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Usia : ");
            arrayOfDosen [i].usia =sc.nextInt();
            sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String input =sc.nextLine().trim();

            if (input.equalsIgnoreCase("Laki laki")) {
                arrayOfDosen [i].jenisKelamin = true;
            }else if (input.equalsIgnoreCase("Perempuan")) {
                arrayOfDosen [i].jenisKelamin = false;
            }else {
                System.out.println("Harap masukkan input dengan benar");
                i--;
            }
            System.out.println();
            
        }
        // cetakInfo(arrayOfDosen);
        DataDosen17.dataSemuaDosen(arrayOfDosen);
        DataDosen17.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen17.rataRataUsiaDosen(arrayOfDosen);
        DataDosen17.usiaDosen(arrayOfDosen);
        
    }
    static void cetakInfo(Dosen17 [] arrayOfDosen ){
        String input = "";
        for (Dosen17 i : arrayOfDosen){
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
}


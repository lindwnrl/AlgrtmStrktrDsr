package Jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        String kode,nama,dummy;
        int sks,jumlahJam;
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        dummy =sc.nextLine();
        int jumlah = Integer.parseInt(dummy);
        MataKuliah17 [] arrayOfMataKuliah17 = new MataKuliah17[jumlah];
        
        for (int i = 0; i < arrayOfMataKuliah17.length; i++) {
            System.out.println("Masukkan data Mata Kuliah ke-"+(i+1));
            System.out.print("Kode       :");
            kode = sc.nextLine();
            System.out.print("Nama       :");
            nama =sc.nextLine();
            System.out.print("SKS        :");
            dummy =sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------");
            System.out.println();

            arrayOfMataKuliah17[i] = new MataKuliah17(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah17[i].tambahData(kode, nama, sks, jumlahJam);
            
            
        }
        
         for (int j = 0; j < arrayOfMataKuliah17.length; j++) {
                System.out.println("Data Mata Kuliah ke-"+(j+1));
                arrayOfMataKuliah17 [j].cetakInfo();
                System.out.println("--------------------------------------");
            }
            sc.close();
    }

}

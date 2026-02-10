package Jobsheet1AnSD;

import java.util.Scanner;

public class PrktkmPmlhn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTugas;
        int nilaiKuis;
        int nilaiUTS;
        int nilaiUAS;
        float a;
        float b;
        float c;
        float d;
        float nilaiAkhir;
        String nilaiHuruf = "";
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        nilaiTugas =sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        nilaiKuis =sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");
         a = nilaiTugas * 20/100;
        b = nilaiKuis * 20/100;
        c = nilaiUTS * 30/100;
        d = nilaiUAS * 40/100;
        nilaiAkhir = a + b + c + d;
        if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            nilaiHuruf = "A";
        }else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        }else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            nilaiHuruf = "B";
        }else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        }else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            nilaiHuruf = "C";
        }else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            nilaiHuruf = "D";
        }else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        }
        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");

        
        }else{
              System.out.println("Nilai Akhir : " + nilaiAkhir);
              System.out.println("Nilai Huruf : " + nilaiHuruf);

        }
        System.out.println("================================");
       
      
    }
}

package Jobsheet1AnSD;

import java.util.Scanner;

public class PrktkmArry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] nilai = new float[8];
        String [] nilaiHuruf1 = new String[8];
        double [] nilaiBobot = new double[8];
        String [] matKul = new String[8];
        int [] bobotSKS = new int[8];
        double bobotSKSFinal = 0;
        double nilaiFinal = 0;
        String nilaiHuruf = "";
        double total=0;
        int totalSKS = 0;
        System.out.println("================================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================================");
        for (int a = 0;a <= 7;a++){
            System.out.print("Masukkan nama Mata Kuliah ke-"+(a+1)+" : ");
            matKul [a] =sc.nextLine();
        }
        for (int c = 0;c <= 7;c++){
            System.out.print("Masukkan nilai Mata Kuliah "+matKul [c]+ " : ");
            nilai [c] =sc.nextFloat();
            nilaiFinal = nilai [c];

        }
        for (int d = 0;d <= 7;d++){
            System.out.println("Masukkan Bobot SKS : ");
            bobotSKS [d] = sc.nextInt();
            bobotSKSFinal = bobotSKS [d];
        }
        for (int i = 0 ; i <= 7;i++){
        if (nilai [i] <= 100 && nilai [i] > 80) {
            nilaiHuruf = "A";
            nilaiHuruf1 [i] = nilaiHuruf;
        }else if (nilai [i] <= 80 && nilai [i] > 73) {
            nilaiHuruf = "B+";
            nilaiHuruf1 [i]= nilaiHuruf;
        }else if (nilai [i] <= 73 && nilai [i] > 65) {
            nilaiHuruf = "B";
            nilaiHuruf1 [i] = nilaiHuruf;
        }else if (nilai [i] <= 65 && nilai [i] > 60) {
            nilaiHuruf = "C+";
            nilaiHuruf1 [i] = nilaiHuruf;
        }else if (nilai [i] <= 60 && nilai [i] > 50) {
            nilaiHuruf = "C";
            nilaiHuruf1 [i] = nilaiHuruf;
        }else if (nilai [i] <= 50 && nilai [i] > 39) {
            nilaiHuruf = "D";
            nilaiHuruf1 [i] = nilaiHuruf;
        }else if (nilai [i] <= 39) {
            nilaiHuruf = "E";
            nilaiHuruf1 [i] = nilaiHuruf;
        }
        }
        for (int j = 0;j <= 7;j++){
            if (nilaiHuruf1 [j] == "A") {
                nilaiBobot [j] = 4.00;
            }else if (nilaiHuruf1 [j] == "B+") {
                nilaiBobot [j] = 3.50;
            }else if (nilaiHuruf1 [j] == "B") {
                nilaiBobot [j] = 3.00;
            }else if (nilaiHuruf1 [j] == "C+" ) {
                nilaiBobot [j] = 2.50;
            }else if (nilaiHuruf1 [j] == "C") {
                nilaiBobot [j] = 2.00;
            }
        }
        System.out.println("==================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==================================================");
        System.out.println("Matkul \t \t Nilai Angka \t\t Nilai Huruf \t Bobot Nilai");
        for (int b = 0;b <= 7;b++){
            System.out.println(matKul[b] +"\t\t\t"+ nilai [b] +"\t\t\t"+ nilaiHuruf1 [b] +"\t\t"+ nilaiBobot[b]);
        }
        for (int g = 0;g <=7;g++){
            total =+ (nilaiBobot[g] * bobotSKS [g]);
            totalSKS =+ bobotSKS[g];
        }
        double ip = total /totalSKS;
        System.out.println("======================================================");
        System.out.println("IP : "+ ip);
    
    }
}

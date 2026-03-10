package Jobsheet5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen : ");
        int elemen = sc.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Total Keuntungan Menggunakan BruteForce: "+sm.TotalBF());
        System.out.println("Total Keuntungan Mengguanakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
        sc.close();
    }
}

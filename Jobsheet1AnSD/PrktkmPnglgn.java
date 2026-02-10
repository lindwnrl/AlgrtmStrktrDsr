package Jobsheet1AnSD;

import java.util.Scanner;

public class PrktkmPnglgn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long nimGw ;
        System.out.print("Masukkan NIM Anda : ");
        nimGw = sc.nextLong();
        long nimakhirgw = nimGw % 100;

        

        for (int i = 1;i <= nimakhirgw;i++){
            if (i == 10 || i == 15) {
                
            }else if (i % 3 == 0) {
                 System.out.print(" # ");
            }else if (i %  2 == 1) {
                System.out.print(" * ");
            } else{
            System.out.print(i);
            }
            System.out.print(" ");
            
            
        }
    }
}

package Jobsheet1AnSD;

import java.util.Scanner;

public class Tgs1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        char namaPlat [] ={'A','B','D','E','F','G','H','L','N','T'};
        char namaKota [][] ={
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
        };
        System.out.print("Masukkan kode plat : ");
        char inputKode =sc.next().charAt(0);

        for (int i = 0; i < namaPlat.length; i++) {
            if (inputKode == namaPlat[i]) {
                for (int j = 0;j < 12 ;j++){
                    System.out.print(namaKota[i][j]);
                }
                break;
            }
        }
    }
}

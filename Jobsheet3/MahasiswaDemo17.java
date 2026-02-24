package Jobsheet3;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Mahasiswa17 [] arrayOfMahasiswa = new Mahasiswa17 [3];
        arrayOfMahasiswa [0] = new Mahasiswa17 ();
        arrayOfMahasiswa [0].nim = "26748354";
        arrayOfMahasiswa [0].nama ="El Viento Bijoss";
        arrayOfMahasiswa [0].kelas = "SIB 1E";
        arrayOfMahasiswa [0].ipk = (float) 3.75;

        arrayOfMahasiswa [1] = new Mahasiswa17 ();
        arrayOfMahasiswa [1].nim = "42532413";
        arrayOfMahasiswa [1].nama = "No lo se";
        arrayOfMahasiswa [1].kelas = "TI 1A";
        arrayOfMahasiswa [1].ipk = (float)3.36;

        arrayOfMahasiswa [2] = new Mahasiswa17 ();
        arrayOfMahasiswa [2].nim = " 683543453";
        arrayOfMahasiswa [2].nama = "je ne seu pais";
        arrayOfMahasiswa [2].kelas = "TI 3C";
        arrayOfMahasiswa [2].ipk = (float)3.67;

        System.out.println("NIM         :"+arrayOfMahasiswa[0].nim);
        System.out.println("Nama        :"+arrayOfMahasiswa[0].nama);
        System.out.println("Kelas       :"+arrayOfMahasiswa[0].kelas);
        System.out.println("IPK         :"+arrayOfMahasiswa[0].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM         :"+ arrayOfMahasiswa[1].nim);
        System.out.println("Nama        :"+arrayOfMahasiswa[1].nama);
        System.out.println("Kelas       :"+arrayOfMahasiswa[1].kelas);
        System.out.println("IPK         :"+arrayOfMahasiswa[1].ipk);
        System.out.println("--------------------------------------");
        System.out.println("NIM         :"+ arrayOfMahasiswa[2].nim);
        System.out.println("Nama        :"+ arrayOfMahasiswa[2].nama);
        System.out.println("Kelas       :"+arrayOfMahasiswa[2].kelas);
        System.out.println("IPK         :"+arrayOfMahasiswa[2].ipk);
        System.out.println("---------------------------------------");
    }
}

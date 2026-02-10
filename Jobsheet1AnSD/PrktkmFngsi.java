package Jobsheet1AnSD;

public class PrktkmFngsi {


    public static int hitungPendapatan(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = hitungPendapatan(stokBunga[i], hargaBunga);
            String status = statusCabang(pendapatan);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp." + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println();
        }
    }
}

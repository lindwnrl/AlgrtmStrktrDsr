package CM2_Copy;

import java.util.Scanner;

public class IniMain {
    
   
    public static Pembeli inputPembeli(Scanner sc){
        System.out.print("Masukkan Nama : ");
        String namaPembeli = sc.nextLine(); 

        System.out.print("Masukkan No.Hp : ");
        String noHp = sc.nextLine();

        return new Pembeli(namaPembeli, noHp);
    }
    public static Pesanan inputPesanan(Scanner sc, String namaPembeli){
        System.out.print("Kode Pesanan : ");
        int kodePesanan = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Pesanan : ");
        String namaPesanan = sc.nextLine();

        System.out.print("Harga : ");
        int harga = sc.nextInt();
        sc.nextLine();
    

        return new Pesanan(kodePesanan, namaPesanan, harga, namaPembeli);
    }
     public static void main(String[] args) {
        IniDLLJuga Pesanan = new IniDLLJuga();
        IniDLL list = new IniDLL();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("====== Sistem Antrian Royal Delish =====");
            System.out.println("1.          Tambah Antrian              ");
            System.out.println("2.          Cetak Antrian               ");
            System.out.println("3.      Hapus Antrian dan Pesan         ");
            System.out.println("4.          Laporan Pesanan             ");
            System.out.println("5.         Antrian Prioritas            ");
            System.out.println("0.              Keluar                  ");
            System.out.println("========================================");
            System.out.print("Pilihan : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Pembeli pmblAwal = inputPembeli(sc);
                    list.add(pmblAwal);
                    break;

                case 2:
                    list.print();
                    break;

                case 3:
                      Pembeli keluar =
                        list.remove();

                    if(keluar != null){

                        System.out.println(
                            "Pembeli dipanggil:"
                        );

                        keluar.tampilPembeli();

                        System.out.println(
                            "=== Input Pesanan ==="
                        );

                        Pesanan pesanan =
                            inputPesanan(sc,keluar.namaPembeli);

                        Pesanan.addLast(pesanan);

                        System.out.println(
                            "Pesanan berhasil disimpan!"
                        );
                    }

                    break;
                case 4:
                       Pesanan.laporanPesanan();
                    break;

                case 5:
                    System.out.println("Masukkan Nomer yang Dicari : ");
                    int keyNomer = sc.nextInt();
                    sc.nextLine();
                    Pembeli dataBaru = inputPembeli(sc);
                    list.insertAfter(keyNomer,dataBaru);

                case 0:
                    System.out.println("Program selesai.");
                    break;    
                default:
                    System.out.println("Menu Ga Valid!");
            }
        }while (pilihan != 0);
        sc.close();
    }
}

package CM1;

import java.util.Scanner;

public class CMDemo {
    public static void main(String[] args) {
        Mahasiswa listMhs = new Mahasiswa(null, null, null);
        listMhs.tambah(new Mahasiswa("Andi", "2145","Teknik Informatika"));
        listMhs.tambah(new Mahasiswa("Budi", "6235", "Sistem Informasi Bisnis"));
        listMhs.tambah(new Mahasiswa("Kidi", "9762", "Teknik Informatika"));
        Buku listBuku = new Buku(null, null, 0);
        listBuku.tambahBuku(new Buku("001", "Algorhytm", 2009));
        listBuku.tambahBuku(new Buku("002", "History", 1998));
        listBuku.tambahBuku(new Buku("003", "Physics", 2017));
        listBuku.tambahBuku(new Buku("004", "Law", 2022));
        Peminjaman listPj = new Peminjaman(listMhs, listBuku, 0);
        listPj.tambahPj(new Peminjaman(listMhs.listMhs[0], listBuku.listBuku[0], 9));
        listPj.tambahPj(new Peminjaman(listMhs.listMhs[1], listBuku.listBuku[1], 6));
        listPj.tambahPj(new Peminjaman(listMhs.listMhs[0], listBuku.listBuku[3], 2));
        listPj.tambahPj(new Peminjaman(listMhs.listMhs[2], listBuku.listBuku[2], 7));
        listPj.tambahPj(new Peminjaman(listMhs.listMhs[1], listBuku.listBuku[0], 5));
        
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("=============== Sistem Peminajaman Buku ================");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Buku ");
            System.out.println("3. Tampilkan Data Peminjaman ");
            System.out.println("4. Menghitung Jumlah Hari dan Denda");
            System.out.println("5. Urutkan Berdasarkan Denda Terbesar");
            System.out.println("6. Cari Berdasarkan NIM");
            System.out.println("0. Keluar ");
        
        System.out.print("Pilihan : ");
        String pilihan =sc.nextLine();
        if (pilihan.equals("1")) {
            listMhs.tampil();
        }else if (pilihan.equals("2")) {
            listBuku.tampil();
        }else if (pilihan.equals("3")) {
            listPj.tampil();
        }else if (pilihan.equals("4")) {
            listPj.hitungSemuaDenda();
            listPj.tampilSemuaDenda();
        }else if (pilihan.equals("5")) {
            listPj.insertionSortAsc();
            listPj.tampilSemuaDenda();
        }else if (pilihan.equals("6")) {
            System.out.print("Masukkan NIM Mahasiswa : ");
            String cari = sc.nextLine();
            
            listPj.tampilSearchByNIM(cari);
            
        }else if (pilihan.equals("0")) {
            break;
        }
    }
    sc.close();
    }
}

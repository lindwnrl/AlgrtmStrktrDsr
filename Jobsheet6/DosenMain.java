package Jobsheet6;

public class DosenMain {
    public static void main(String[] args) {
        System.out.println("Test");
        DataDosen list = new DataDosen();
        
        Dosen d1 = new Dosen("123", "Budi", false, 42);
        Dosen d2 = new Dosen("124", "Rudi", false, 37);
        Dosen d3 = new Dosen("125", "Judy", true, 29);
        Dosen d4 = new Dosen("126", "Madi", false, 48);
        Dosen d5 = new Dosen("127", "Edi", false, 32);
        Dosen d6 = new Dosen("128", "Cindy", true, 30);
        Dosen d7 = new Dosen("129", "Adi", false, 53);
        Dosen d8 = new Dosen("130", "Diddy", false, 67);
        Dosen d9 = new Dosen("131", "Wendy", true, 46);
        Dosen d10 = new Dosen("132", "Melody", true, 48);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        System.out.println("Tampilan data kasar");
        list.tampil();
        System.out.println("Tampilan setelah di sorting menggunakan Bubble Sort (Ascending)");
        list.bubbleSortASC();
        list.tampil();
        System.out.println("Tampilan setelah di sorting menggunakan Insertion Sort (Descending)");
        list.insertionSortDSC();
        list.tampil();
    }
}

package Jobsheet14;

public class BinaryTreeMain17 {
    public static void main(String[] args) {
        BinaryTree17 bst = new BinaryTree17();
        
        bst.add(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa17("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa17("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa17("244160220", "Dewi", "B", 3.54));

        System.out.println("Daftar Semua Mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("Pencarian data mahasiswa : ");
        System.out.println("Cari Mahasiswa dengan ipk : 3.54");
        String hasilcari = bst.find(3.54)?"Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilcari);

        System.out.println("Cari mahasiswa dengan ipk: 3.22 ;");
        hasilcari = bst.find(3.22)?"Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilcari);

        bst.add(new Mahasiswa17("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa17("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa17("244160170", "Firi", "B", 3.46));
        System.out.println("Daftar semua mahasiswa setelah penambahan 3 mahasiswa");
        System.out.println("InOrder Traversal");
        bst.traverseInOrder(bst.root);
        System.out.println("PreOrder Traversal");
        bst.traversePreOrder(bst.root);
        System.out.println("PostOrder Traversal");
        bst.traversePostOrder(bst.root);

        System.out.println("Penghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (InOrder Traversal");
        bst.traverseInOrder(bst.root);

        System.out.println("Tambah data rekursif");
        bst.addRekursif(new Mahasiswa17("244160300", "Rama", "A", 3.90));

        System.out.println("InOrder Traversal");
        bst.traverseInOrder(bst.root);

        System.out.println("IPK minimum");
        bst.cariMinIPK();

        System.out.println("IPK maksimum");
        bst.cariMaxIPK();

        System.out.println("Mahasiswa dengan IPK di atas 3.50");
        bst.tampilMahasiswaIPKDiAtas(3.50);
    }


}

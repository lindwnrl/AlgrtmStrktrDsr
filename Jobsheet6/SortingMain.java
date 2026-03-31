package Jobsheet6;

public class SortingMain {
    public static void main(String[] args) {
        
    int a [] = {20,10,2,7,12};
    Sorting17 dataurut1 = new Sorting17(a, 5);
    System.out.println("Data Awal 1");
    dataurut1.tampil();
    dataurut1.bubbleSort();
    System.out.println("Data sudah diurutkan dengan Bubble Sort (Ascending)");
    dataurut1.tampil();
    int b [] = {30,20,2,8,14};
    Sorting17 dataurut2 = new Sorting17(b, b.length);
    System.out.println("Data awal 2");
    dataurut2.tampil();
    dataurut2.SelectionSort();
    System.out.println("Data sudah diurutkan dengan Selection Sort (Ascending)");
    dataurut2.tampil();
    int c [] = {40,10,4,9,3};
    Sorting17 dataurut3 = new Sorting17(c, c.length);
    System.out.println("Data awal 3");
    dataurut3.tampil();
    dataurut3.InsertionSort();
    System.out.println("Data sudah diurutkan dengan Insertion Sort (Ascending)");
    dataurut3.tampil();
    }
    
}

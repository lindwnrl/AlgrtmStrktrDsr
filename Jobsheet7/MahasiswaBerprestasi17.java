package Jobsheet7;

public class MahasiswaBerprestasi17 {

    Mahasiswa17 [] listMhs = new Mahasiswa17[5];
    int idx;

    void tambah (Mahasiswa17 m){
        if (idx < listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil(){
         for (Mahasiswa17 m : listMhs){
            m.tampilInformasi();
            System.out.println("------------------------------");
        }
    }
    int sequentialSearch(double cari){
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x,int pos){
        if (pos !=-1) {
            System.out.println("Data Mahasiswa dengan IPK :" +x+ " ditemukan pada index " + pos);
        }
        else{
            System.out.println("Data "+x+ " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x,int pos){
        if (pos !=-1) {
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Kelas\t : "+ listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        }
        else{
            System.out.println("Data mahasiswa dengan ipk "+x+ " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari,int left,int right){
        int mid;
        if (right>=left) {
            mid=(left+ right)/2;
            if (cari == listMhs[mid].ipk) {
                return(mid);
            }else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            }else {
                return findBinarySearch(cari, mid + 1 ,right);
            }
        }
        return -1;
    }
}
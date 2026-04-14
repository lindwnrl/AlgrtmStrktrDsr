package CM1;

public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    int idx = 0;
    
    Mahasiswa (String nama,String nim,String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }
   
    void tampilMahasiswa(){
       
        System.out.println("Nama : "+ nama +" | NIM : "+ nim +" | Prodi : "+ prodi);
    }
    Mahasiswa [] listMhs = new Mahasiswa[3];
     void tambah (Mahasiswa m){
        if (idx < listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil(){
         System.out.println("Daftar Mahasiswa :");
         for (Mahasiswa m : listMhs){
            m.tampilMahasiswa();
        }
          System.out.println("---------------------------------------------");
    }
    int sequentialSearch(double cari){
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            double nimMhs = Double.parseDouble(listMhs[i].nim);
            if (nimMhs == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }       
    void tampilPosisi(double x,int pos){
        if (pos !=-1) {
            System.out.println("Data Mahasiswa dengan NIM :" +x+ " ditemukan pada index " + pos);
        }
        else{
            System.out.println("Data "+x+ " tidak ditemukan");
        }
    }
}  

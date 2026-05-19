package CM2;

public class IniDLLJuga {
    IniNodeJuga head;
    IniNodeJuga tail;

    public IniDLLJuga(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(Pesanan data){

        IniNodeJuga newNode = new IniNodeJuga(data);

        if(isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
     public void sortByNamaPesanan(){

        if(head == null){
            return;
        }

        boolean swapped;

        do{
            swapped = false;

            IniNodeJuga current = head;

            while(current.next != null){

                String a = current.data.namaPesanan;
                String b = current.next.data.namaPesanan;

                if(a.compareToIgnoreCase(b) > 0){

                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }

                current = current.next;
            }

        } while(swapped);
    }

    public void laporanPesanan(){

        if(isEmpty()){
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortByNamaPesanan();

        System.out.println("===== LAPORAN PESANAN =====");
        System.out.println(
            "Kode      |       Nama Menu       |        Harga       |        Nama Pembeli"
        );

        IniNodeJuga current = head;

        int total = 0;

        while(current != null){
            
            current.data.tampilPesanan();

            total += current.data.harga;

            current = current.next;
        }

        System.out.println("===========================");
        System.out.println("Total Pendapatan : " + total);
    }
    
}

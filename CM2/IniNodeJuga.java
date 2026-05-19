package CM2;

public class IniNodeJuga {
    Pesanan data;
    IniNodeJuga prev;
    IniNodeJuga next;

    public IniNodeJuga(Pesanan data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

package CM2_Copy;

public class IniNode {
    Pembeli data;
    IniNode prev;
    IniNode next;

    public IniNode(Pembeli data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

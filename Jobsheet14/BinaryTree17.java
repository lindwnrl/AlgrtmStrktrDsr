package Jobsheet14;

public class BinaryTree17 {
    Node17 root;

    BinaryTree17(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void add(Mahasiswa17 mahasiswa){
        Node17 newnode = new Node17(mahasiswa);
        if (isEmpty()) {
            root = newnode;
        }else{
            Node17 current = root;
            Node17 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newnode;
                        return;
                    }
                }else{
                    current = current.right;
                    if (current == null) {
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
    }
    boolean find(double ipk){
        boolean result = false;
        Node17 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            }else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return result;
    }
    void traversePreOrder(Node17 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traverseInOrder(Node17 node){
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }
    void traversePostOrder(Node17 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }
    Node17 getSucessor(Node17 del){
        Node17 sucessor = del.right;
        Node17 sucessorParent = del;
        while (sucessor.left != null) {
            sucessorParent = sucessor;
            sucessor = sucessor.left;
        }
        if (sucessor != del.right) {
            sucessorParent.left = sucessor.right;
            sucessor.right = del.right;
        }
        return sucessor;
    }
    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            }else if (ipk < current.mahasiswa.ipk) {
                parent =current;
                current = current.left;
                isLeftChild = false;
            }else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }else{
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }else {
                if (isLeftChild) {
                    parent.left = null;
                }else{
                    parent.right = null;
                }
            }
        }else if (current.left == null) {
            if (current == root) {
                root = current.right;
            }else{
                if (isLeftChild) {
                    parent.left = current.right;
                }else{
                    parent.right = current.right;
                }
            }
        }else if (current.right == null) {
            if (current == root) {
                root = current.left;
            }else{
                if (isLeftChild) {
                    parent.left = current.left;
                }else{
                    parent.right = current.left;
                }
            }
        }else if (current.right == null) {
            if (current == root) {
                root = current.left;
            }else{
                if (isLeftChild) {
                    parent.left =current.left;
                }else{
                    parent.right =current.left;
                }
            }
        }else{
        Node17 sucessor = getSucessor(current);
        System.out.println("Jika 2 anak, current = ");
        sucessor.mahasiswa.tampilInformasi();
        if (current == root) {
            root = sucessor;
        }else{
            if (isLeftChild) {
                parent.left = sucessor;
            }else {
                parent.right = sucessor;
            }
        }
        sucessor.left =current.left;
        }
        }
    }
    void addRekursif(Mahasiswa17 mahasiswa){
    root = addRekursif(root, mahasiswa);
}

Node17 addRekursif(Node17 current, Mahasiswa17 mahasiswa){
    if (current == null) {
        return new Node17(mahasiswa);
    }

    if (mahasiswa.ipk < current.mahasiswa.ipk) {
        current.left = addRekursif(current.left, mahasiswa);
    }else{
        current.right = addRekursif(current.right, mahasiswa);
    }

    return current;
}
void cariMinIPK(){
    if (isEmpty()) {
        System.out.println("Tree kosong");
        return;
    }

    Node17 current = root;

    while (current.left != null) {
        current = current.left;
    }

    System.out.println("Mahasiswa dengan IPK terkecil : ");
    current.mahasiswa.tampilInformasi();
}
void cariMaxIPK(){
    if (isEmpty()) {
        System.out.println("Tree kosong");
        return;
    }

    Node17 current = root;

    while (current.right != null) {
        current = current.right;
    }

    System.out.println("Mahasiswa dengan IPK terbesar : ");
    current.mahasiswa.tampilInformasi();
}
void tampilMahasiswaIPKDiAtas(double ipkBatas){
    tampilMahasiswaIPKDiAtas(root, ipkBatas);
}

void tampilMahasiswaIPKDiAtas(Node17 node, double ipkBatas){
    if (node != null) {

        tampilMahasiswaIPKDiAtas(node.left, ipkBatas);

        if (node.mahasiswa.ipk > ipkBatas) {
            node.mahasiswa.tampilInformasi();
        }

        tampilMahasiswaIPKDiAtas(node.right, ipkBatas);
    }
}

}

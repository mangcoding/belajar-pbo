import java.util.LinkedList;

public class AppLinked {
    // membuat LinkedList kosong
    public static void main(String[] args) throws Exception {
        LinkedList<String> myLinkedList = new LinkedList<>();

        // menambahkan elemen ke LinkedList
        myLinkedList.add("Java");
        myLinkedList.add("Python");
        myLinkedList.add("C++");

        // mencetak elemen di LinkedList
        System.out.println("Elemen di LinkedList: " + myLinkedList);

        // menghapus elemen dari LinkedList
        myLinkedList.remove("Python");

        // mencetak elemen di LinkedList setelah penghapusan
        System.out.println("Elemen di LinkedList setelah penghapusan: " + myLinkedList);
    }

}

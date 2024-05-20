import java.util.ArrayList;
public class AppArray {
    public static void main(String[] args) throws Exception {
        // membuat ArrayList kosong dengan kapasitas awal 10
        ArrayList<String> myArrayList = new ArrayList<>();

        // menambahkan elemen ke ArrayList
        myArrayList.add("Java");
        myArrayList.add("Python");
        myArrayList.add("C++");

        // mencetak elemen di ArrayList
        System.out.println("Elemen di ArrayList: " + myArrayList);

        // menghapus elemen dari ArrayList
        myArrayList.remove("Python");

        // mencetak elemen di ArrayList setelah penghapusan
        System.out.println("Elemen di ArrayList setelah penghapusan: " + myArrayList);
    }
}

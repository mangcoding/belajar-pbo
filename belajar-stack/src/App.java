import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<String> Mainan = new Stack<String>();
        Mainan.push("Bola");
        Mainan.add("Papan Catur");
        Mainan.push("Bola Voli");
        Mainan.pop();
        Mainan.set(0, "Shuttle Kock");
        System.out.println("Stack yang diambil \t\t\t : " + Mainan.peek());
        System.out.println("Stack yang terakhir/paling atas \t : " + Mainan.lastElement());
        System.out.println("Stack yang awal/paling bawah \t\t : " + Mainan.firstElement());
        System.out.println("Stack items \t\t\t\t : " + Mainan);
        Mainan.remove(1);
        System.out.println("Apakah Stack kosong? \t\t\t : " + Mainan.empty());
        System.out.println("Apakah Stack kosong? \t\t\t : " + Mainan.isEmpty());
        System.out.println("Jumlah stack \t\t\t\t : " + Mainan.size());
        System.out.println("Stack items \t\t\t\t : " + Mainan);
        Mainan.clear();
        System.out.println("Apakah Stack kosong? \t\t\t : " + Mainan.isEmpty());
    }
}

import java.util.Scanner;
public class NilaiIndeks {
    public static void main(String[] args) throws Exception {
        int nilai;
        String indeks;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        nilai = inputan.nextInt();

        if (nilai >= 85) {
            indeks = "A";
        } else if (nilai >= 75) {
            indeks = "B";
        } else if (nilai >= 65) {
            indeks = "C";
        } else if (nilai >= 55) {
            indeks = "D";
        } else {
            indeks = "E";
        }

        System.out.println("Nilai " + nilai + " dengan indeks " + indeks);
    }
}

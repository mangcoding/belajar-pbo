import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) throws Exception {
        /* menghitung bilangan ganjil/genap */
        Double nilai;
        String indeksNilai;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        nilai = inputan.nextDouble();

        if (nilai >= 75) {
            indeksNilai = "A";
        } else if (nilai >= 65) {
            indeksNilai = "B";
        } else if (nilai >= 55) {
            indeksNilai = "C";
        } else {
            indeksNilai = "E";
        }

        System.out.println("Indeks nilai: " + indeksNilai);
    }
}

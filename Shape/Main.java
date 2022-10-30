import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        Segitiga segiA = new Segitiga(alas, tinggi);
        System.out.println("Luas segitiga A: " + segiA.getLuas());
        segiA.setAlas(15);
        System.out.println("Luas segitiga B: " + segiA.getLuas());
        System.out.println("Keliling segitiga: " + segiA.getKeliling());
    }
}
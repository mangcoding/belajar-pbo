import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) throws Exception {
        /* menghitung bilangan ganjil/genap */
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = inputan.nextInt();

        if (tahun % 4 == 0) {
            System.out.println(tahun+" adalah Tahun Kabisat");
        } else {
            System.out.println(tahun+" Bukan tahun Kabisat");
        }
    }
}

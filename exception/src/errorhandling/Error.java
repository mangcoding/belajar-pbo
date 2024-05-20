package errorhandling;
import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        /* get inputan from user using scanner */
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int number = input.nextInt();
        int result = number*10;
        System.out.println("Hasil perkalian: " + result);
        System.out.println("Perintah selanjutnya");
        input.close();
    }
}


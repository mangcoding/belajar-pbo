package errorhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* get inputan from user using scanner */
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        try {
            int number = input.nextInt();
            int result = number*10;
            System.out.println("Hasil perkalian: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi error salah input data");
        } finally{
            System.out.println("Finally you been here");
        }
        
        System.out.println("Perintah selanjutnya");
        input.close();
    }
}


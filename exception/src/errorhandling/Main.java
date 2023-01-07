package errorhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* get inputan from user using scanner */
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        try {
            // get string from input
            int angka = input.nextInt();
            if (angka > 10) {
                throw new Exception("Terjadi error, Nilai yang diinput tidak boleh lebih dari 10");
            }else{
                System.out.println("Nilai yang diinput: "+angka);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

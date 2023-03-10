import java.util.Scanner;
public class LoopInput {
    
    public static void main(String[] args) throws Exception {
        /* Mengulang kondisi selamat nilai yang di input belum terpenuhi */
        Scanner inputan = new Scanner(System.in);
        int jawaban = 2;
        do {
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Apakah kamu mau berhenti? ");
            jawaban = inputan.nextInt();
        } while (jawaban == 2);
    }
}

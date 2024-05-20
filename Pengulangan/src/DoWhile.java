import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int pilihan=0;
        do {
            System.out.println("1. Input Data: ");
            System.out.println("2. Lihat Data: ");
            System.out.println("3. Hapus Data: ");
            System.out.println("4. Keluar: ");
            System.out.print("Pilih Menu: ");
            pilihan = inputan.nextInt();
        } while (pilihan !=4);

        inputan.close();
    }
}

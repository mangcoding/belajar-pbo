import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int pilihan = 0;
        Scanner inputan = new Scanner(System.in);
        do {
            System.out.println("==================================");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih Menu: ");
            pilihan = inputan.nextInt();
        }while(pilihan != 3);
        inputan.close();
    }
}

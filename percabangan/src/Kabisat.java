import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Tahun: ");
        int tahun = inputan.nextInt();

        if (tahun % 4 == 0) {
            System.out.println(tahun+" Tahun Kabisat");
        }else{
            System.out.println(tahun+" bukan Tahun Kabisat");
        }
    }
}

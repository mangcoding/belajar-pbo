import java.util.Scanner;

public class Kembalian {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int harga, bayar, kembalian;
        System.out.print("Masukkan harga barang:");
        harga = input.nextInt();
        System.out.print("Masukkan uang yang dibayarkan: ");
        bayar = input.nextInt();
        kembalian = bayar - harga;
        System.out.println("Kembalian: " + kembalian);
        input.close();
    }
}

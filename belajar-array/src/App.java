import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = inputan.nextInt();

        String Mahasiswa[] = new String[n];

        for(int i=0; i<n; i++) {
            System.out.print("Masukkan Nama Mahasiswa: ");
            Mahasiswa[i] = inputan.next();
        }

        System.out.print("Nama-nama Mahasiswa yang di input: ");
        for(int i=0; i<n; i++) {
            System.out.print(Mahasiswa[i]+", ");
        }

        inputan.close();
    }
}

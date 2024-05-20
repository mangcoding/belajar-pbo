import java.util.Scanner;
public class SimpleArray {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = inputan.nextInt();
        String[] mahasiswa= new String[n];

        for(int i=0; i<n; i++) {
            System.out.print("Masukkan Nama Mahasiswa: ");
            mahasiswa[i] = inputan.next();
        }

        System.out.print("Nama-nama Mahasiswa yang di input: ");
        for(int a=0; a<mahasiswa.length; a++) {
            System.out.print(mahasiswa[a]+" ");
        }
        inputan.close();
    }
}

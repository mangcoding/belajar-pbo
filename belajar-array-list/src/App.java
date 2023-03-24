import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> Mahasiswa = new ArrayList<String>();
        String jawaban;
        do {
            System.out.print("Masukkan Nama Mahasiswa : ");
            String nama = System.console().readLine();
            Mahasiswa.add(nama);
            System.out.print("Apakah Anda Ingin Menambahkan Nama Lagi? (Y/N)");
            jawaban = System.console().readLine();
        } while (jawaban.equals("Y") || jawaban.equals("y"));

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama");
        for (int i = 0; i < Mahasiswa.size(); i++) {
            System.out.println((i+1)+"\t"+Mahasiswa.get(i)+"\t");
        }
    }
}

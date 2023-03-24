import java.util.ArrayList;
public class Main {
    private ArrayList <Mahasiswa> dataMasiswa;
    public static void main(String[] args) throws Exception {
        Main Screen = new Main();
        Screen.inputData();
        Screen.cetakData();
    }
    public void inputData() {
        dataMasiswa = new ArrayList<Mahasiswa>();
        String jawaban;
        int number = 1;
        do {
            System.out.println("________________________________");
            System.out.println("Data Mahasiswa ke "+number);
            System.out.print("NIM : ");
            String nim = System.console().readLine();
            System.out.print("Nama : ");
            String name = System.console().readLine();
            System.out.print("Jurusan : ");
            String jurusan = System.console().readLine();
            System.out.print("IPK : ");
            double ipk = Double.parseDouble(System.console().readLine());
            Mahasiswa mahasiswa = new Mahasiswa(name, nim, jurusan, ipk);
            dataMasiswa.add(mahasiswa);
            System.out.print("Apakah Anda Ingin Menambahkan Nama Lagi? (Y/N)");
            jawaban = System.console().readLine();
            number++;
        } while (jawaban.equals("Y") || jawaban.equals("y"));
    }
    public void cetakData() {
        System.out.println("\n\n======================================================================================");
        System.out.println("DAFTAR KELULUSAN MAHASISWA");
        System.out.println("======================================================================================");
        System.out.println("No\tNIM\t\tNama\t\tJurusan\t\t\tIPK\tKeterangan");
        System.out.println("======================================================================================");
        int n_summa = 0;
        int n_cumlaude = 0;
        int n_lulus = 0;

        for (int i = 0; i < dataMasiswa.size(); i++) {
            System.out.println((i+1)+"\t"+dataMasiswa.get(i).nim+"\t"+dataMasiswa.get(i).name+"\t"+dataMasiswa.get(i).jurusan+"\t"+dataMasiswa.get(i).ipk+"\t"+dataMasiswa.get(i).keterangan);

            if (dataMasiswa.get(i).keterangan.equals("Summa Cumlaude")) {
                n_summa++;
            } else if (dataMasiswa.get(i).keterangan.equals("Cumlaude")) {
                n_cumlaude++;
            }
            
            if (dataMasiswa.get(i).ipk >= 2.5) {
                n_lulus++;
            }
        }

        System.out.println("======================================================================================");
        System.out.println("\n\nJumlah Mahasiswa : "+dataMasiswa.size());
        System.out.println("Jumlah Mahasiswa Summa Cumlaude : "+n_summa);
        System.out.println("Jumlah Mahasiswa Cumlaude : "+n_cumlaude);
        System.out.println("Jumlah Mahasiswa Lulus : "+n_lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus : "+(dataMasiswa.size()-n_lulus));

    }
}

import java.util.ArrayList;
public class AppBuku {
    public static void main(String[] args) throws Exception {
        ArrayList <Buku> buku = new ArrayList<Buku>();

        while(true) {
            System.out.print("Judul : ");
            String judul = System.console().readLine();
            System.out.print("Pengarang : ");
            String pengarang = System.console().readLine();
            System.out.print("Penerbit : ");
            String penerbit = System.console().readLine();
            System.out.print("Tahun : ");
            int tahun = Integer.valueOf(System.console().readLine());
            System.out.print("Category : ");
            int category = Integer.valueOf(System.console().readLine());

            buku.add(new Buku(judul,pengarang,penerbit,tahun,category));
            String jawaban = System.console().readLine("Apakah Anda Ingin Menambahkan Buku? (Y/N)");
            if (jawaban.equals("N") || jawaban.equals("n")) {
                break;
            }
        }

        System.out.println("======================================================");
        System.out.println("Daftar Buku Java yang Tersedia");
        System.out.println("======================================================");
        System.out.println("No\tJudul\t\t\tPengarang\tPenerbit\tTahun");
        int no=1;
        for(Buku b : buku){
            System.out.println(no+"\t"+b.judul+"\t"+b.pengarang+"\t"+b.penerbit+"\t"+b.tahun+"\t");
            no++;
        }
    }
}

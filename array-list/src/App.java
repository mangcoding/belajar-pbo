import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        mhs.add(new Mahasiswa("Nadilla","10424242","Teknik Informatika","2000","Perempuan"));

        mhs.add(new Mahasiswa("Asep","10424001","Sistem Informasi","2002","Laki-laki"));

        mhs.add(new Mahasiswa("Yuni","10424002","DKV\t\t","2002","Perempuan"));

        System.out.println("=====================================================================================================");
        System.out.println("No\tNama\t\tNIM\t\tJurusan\t\t\tUmur\tJenis Kelamin");
        System.out.println("=====================================================================================================");
        int i=1;
        for (Mahasiswa m :mhs) {
            System.out.println(i+"\t"+m.nama+"\t\t"+m.nim+"\t"+m.jurusan+"\t"+m.getUmur()+"\t\t"+m.jenis_kelamin);
            i++;
        }

    }
}

import java.util.ArrayList;

public class Modifikasi {
    public static void main(String[] args) throws Exception {
        ArrayList <String> Mahasiswa = new ArrayList<String>();
        Mahasiswa.add("Silvia");
        Mahasiswa.add(0,"Thomas");
        Mahasiswa.add("John");
        Mahasiswa.set(2,"Dimas");
        Mahasiswa.add(2,"Adriq");
        Mahasiswa.remove(1);

        for (String name:Mahasiswa) {
            System.out.print(name+" ");
        }
    }
}

import java.util.ArrayList;

public class BelajarArray {
    public static void main(String[] args) throws Exception {
        ArrayList <String> Siswa = new ArrayList<String>();
        Siswa.add("Riko");
        Siswa.add("Pardi");
        Siswa.add("Leoni");
        Siswa.set(2,"Dimas");
        Siswa.add(1,"Ayuni");

        for (String name:Siswa) {
            System.out.print(name+" ");
        }
        System.out.println("\nafter: ");
        Siswa.remove(0);
        for (String name:Siswa) {
            System.out.print(name+" ");
        }
    }
}

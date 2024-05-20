import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> MahasiswaList = new ArrayList<String>();
        MahasiswaList.add("Riko");
        MahasiswaList.set(0,"Ayu");
        MahasiswaList.add("Dimas");
        MahasiswaList.add(1,"John");
        MahasiswaList.add("Supandi");
        MahasiswaList.remove(2);
        // MahasiswaList.clear();
        for (int i=0; i<MahasiswaList.size(); i++) {
            System.out.print(MahasiswaList.get(i)+" ");
        }

        for (String name:MahasiswaList) {
            System.out.print(name+" ");
        }

    }
}

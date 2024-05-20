import java.util.ArrayList;
public class Contoh {
    public static void main(String[] args) throws Exception {
        ArrayList <Integer> jumlah = new ArrayList<Integer>();
        jumlah.add(1);
        jumlah.add(2);
        jumlah.add(5);

        System.out.print(jumlah.get(2));

        for(int i = 0; i < jumlah.size(); i++){
            System.out.print(jumlah.get(i)+" ");
        }

        ArrayList <String> nama = new ArrayList<String>();
        nama.add("Riko");
        nama.add("Pardi");
        nama.add("Leoni");

        for (String name:nama) {
            System.out.println(name);
        }
    }
}
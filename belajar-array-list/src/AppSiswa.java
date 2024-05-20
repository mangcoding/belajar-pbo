import java.util.ArrayList;
public class AppSiswa {
    public static void main(String[] args) throws Exception {
        ArrayList <Siswa> Registrant = new ArrayList<Siswa>();

        Registrant.add(new Siswa(
            "Ahmad",
            "Sukabumi",
            "2001-01-02",
            "085723457891",
            "Bogor"
        ));

        Registrant.add(new Siswa(
            "Rizky",
            "Bogor",
            "2002-09-02",
            "081211231123",
            "Sukabumi"
        ));

        Registrant.add(new Siswa(
            "Rahmat",
            "Bandung",
            "2003-01-02",
            "083838383",
            "Bandung"
        ));

        System.out.println("=================================================");
        System.out.println("No\tNama\t\t\tUmur\tKota");
        for (Siswa data:Registrant) {
            System.out.println(
                (Registrant.indexOf(data)+1) + "\t" +
                data.name + "\t\t\t" +
                data.getAge() + "\t" +
                data.city
            );
        }
        System.out.println("=================================================");
    }   
}

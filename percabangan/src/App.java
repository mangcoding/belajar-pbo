import java.util.Scanner;
public class App {
    public static void main(String[] args){
        String ket;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = inputan.nextInt();

        if (angka % 2 == 0) 
            ket = "Genap";
        else
            ket = "ganjil";

        System.out.println("Angka " + angka + " adalah bilangan "+ket);
    }
}

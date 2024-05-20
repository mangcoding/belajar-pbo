package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File namaFile = new File("/Users/nugraha/NusaPutra/Looping.txt");
            if (namaFile.createNewFile()) {
                System.out.println("File berhasil dibuat: " + namaFile.getName());
            }

            FileWriter fileWriter = new FileWriter(namaFile,true);
            fileWriter.write("\nHello World");
            fileWriter.close();

            Scanner input = new Scanner(namaFile);
            while(input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }
            System.out.println("Ukuran file dalam byte: " + namaFile.length());
            // namaFile.delete();
            input.close();
        }catch (Exception e) {
            System.out.println("Terjadi error saat membuat file");
            e.printStackTrace();
        }
    }
}
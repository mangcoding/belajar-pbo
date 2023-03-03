import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Gaji {
    public static void main(String[] args) throws Exception {
        double gajiPokok, gajiTotal, UpahLembur, UpahLemburPerjam, Bonus;
        int jamLembur;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = inputan.nextDouble();

        System.out.print("Masukkan jam lembur: ");
        jamLembur = inputan.nextInt();

        UpahLemburPerjam = gajiPokok/173;
        
        System.out.print("Masukkan Bonus bulan ini ");
        Bonus = inputan.nextDouble();

        if (jamLembur >= 5) {
            UpahLembur = (5*1.5*UpahLemburPerjam) + ((jamLembur-5)*2*UpahLemburPerjam);
        } else {
            UpahLembur = jamLembur*1.5*UpahLemburPerjam;
        }

        gajiTotal = gajiPokok + UpahLembur + Bonus;

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        
        String gajiTotalFormatted = nf.format(gajiTotal);

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Upah Lembur " + UpahLembur);
        System.out.println("Bonus " + Bonus);
        System.out.println("Gaji total: " + gajiTotalFormatted);
    }
}

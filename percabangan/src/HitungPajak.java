import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class HitungPajak {
    public static void main(String[] args){
        Double gaji;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan gaji: ");
        gaji = inputan.nextDouble();

        System.out.print("1. Belum Menikah, 2. Menikah, 3. Menikah 2 Anak, 4. Menikah 3 Anak");
        System.out.print("\nMasukkan Golongan PTKP: (1-4) ");
        int golongan = inputan.nextInt();

        NumberFormat nf = NumberFormat.getInstance(new Locale("usa", "USA"));
        double pajaktahunan = HitungPajak.hitungPajak(gaji,golongan);
        String pajak = nf.format(pajaktahunan);
        String pajakbulanan = nf.format(pajaktahunan/12);

        System.out.println("PPh 21 terutang (Setahun): " + pajak);
        System.out.println("PPh 21 atas Gaji Bulan ini: " + pajakbulanan);
        inputan.close();
    }

    static double hitungPajak(Double gaji, int golongan) {
        double gajitahunan = gaji*12;
        double pajak;

        NumberFormat nf = NumberFormat.getInstance(new Locale("usa", "USA"));
        System.out.println("Penghasilan disetahunkan: " + nf.format(gajitahunan));
        System.out.println("Penghasilan Tidak Kena Pajak: " + nf.format(getPKP(golongan)));
        double pkp = gajitahunan - getPKP(golongan);
        System.out.println("Penghasilan Kena Pajak: " + nf.format(pkp));

        if (pkp > 5000000000.00) {
            pajak = (pkp-500000000.00)*0.30 + 250000000.00*0.25 + 200000000.00*0.15 + 50000000.00*0.05;
        } else if (pkp > 250000000.00) {
            pajak = (pkp-250000000.00)*0.25 + 200000000.00*0.15 + 50000000.00*0.05;
        } else if (pkp > 50000000.00) {
            pajak = (pkp-50000000.00)*0.15 + 50000000.00*0.05;
        } else {
            pajak = pkp*0.05;
        }
        return pajak;
    }

    static double getPKP(int golongan) {
        switch (golongan) {
            case 1:
                return 54000000;
            case 2:
                return 58500000;
            case 3:
                return 63000000;
            case 4:
                return 67500000;
            default:
                return 0;
        }
    }
    static double getPKPif(int golongan) {
        if (golongan == 1) {
            return 54000000;
        } else if (golongan == 2) {
            return 58500000;
        } else if (golongan == 3) {
            return 63000000;
        } else if (golongan == 4) {
            return 67500000;
        } else {
            return 0;
        }
    }
}

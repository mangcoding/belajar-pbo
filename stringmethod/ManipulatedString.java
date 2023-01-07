import java.util.Scanner;

class ManipulatedString {
    public static void main (String[] args) {
        System.out.println("Masukkan sebuah teks:");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        System.out.println(ManipulatedString.reverse(inputText));
        sc.close();
    }

    public static void isPallindrom(String text) {
        
    }

    public static String reverse(String text) {
        String s = text;
        Integer jml = s.length();
        String hasil = "";

        for (int i = jml; i > 0; i--) {
            hasil = hasil + s.substring(i-1, i);
        }
        return hasil;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /* Mengulang Kalimat sebanyak 10 kali */
        for (int i=1; i<=10; i++) {
            System.out.println(i+". Aku sayang kamu");
        }

        int x =1;
        do {
            System.out.println(x+". Aku sayang kamu");
            x +=1; // x=x+1 atau x++
        }while(x<=10);

        x =1;
        while (x<=100) {
            System.out.println(x+". Aku sayang kamu");
            x +=1; // x=x+1 atau x++
        }
    }
}

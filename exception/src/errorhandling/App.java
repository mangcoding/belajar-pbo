package errorhandling;

public class App {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            if (numbers.length > 10) {
                System.out.println(numbers[10]);
            } else {
                System.out.println(numbers[11]);
            }
        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }

        System.out.println("Program Selanjutnya");
        System.out.println("Program Selanjutnya 2");
        System.out.println("Program Selanjutnya 3");

    }
}

package errorhandling;

public class App {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        // System.out.println(numbers[10]);
        try{
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("Ada Error, ket:"+e.getMessage());
        } finally{
            System.out.println("Program berakhir 1");
        }
        System.out.println("Program berakhir 2");
    }
}

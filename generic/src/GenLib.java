public class GenLib {
    public static <A extends Number,B extends Number> void add(A number1, B number2) {
        Double results = number1.doubleValue() + number2.doubleValue();
        System.out.println(results);
    }

    public static <A,B> void printAlamat(A address1, B address2) {
        System.out.println(address1 + " " + address2);
    }
}





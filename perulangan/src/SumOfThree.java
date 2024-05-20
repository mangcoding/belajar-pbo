public class SumOfThree {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 0;
        System.out.print(a + " " + b + " " + c + " ");
        for (int i=0; i<10; i++) {
            d = a + b + c;
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int a=0, b=1, c=2, d=0;
        int maxLoop = 7;

        for (int i=0; i<maxLoop; i++) {
            if (i==1 || i==2) 
                d = 1;
            else
                d = a + b + c;
            
            System.out.println(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}

/* output : 0 1 1 2 4 7 13 */



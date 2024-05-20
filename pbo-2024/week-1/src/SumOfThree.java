public class SumOfThree {
    private int a=0;
    private int b=0;
    private int c=0;

    public SumOfThree(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displayResult(int maxLoop) {
        int d = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("\nSum of first three numbers: "+this.a+","+this.b+","+this.c+": ");
        for (int i=0; i<maxLoop; i++) {
            if (i == 0) 
                d = this.a;
            else if (i == 1) 
                d = this.b;
            else if (i == 2)
                d = this.c;
            else
                d = a + b + c;

            System.out.print(d+" ");
            a = b;
            b = c;
            c = d;
        }
    }
}

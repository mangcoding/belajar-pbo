public class SumOfThree {
    private int a=0, b=1, c=2;

    public SumOfThree(int a,int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displayResult(int maxLoop) {
        int a=this.a, b=this.b, c=this.c, d=0;
        System.out.print(a + " "+b + " "+c + " ");
        for (int i=0; i<maxLoop; i++) {
            if (i>2)
                d = a + b + c;
            else 
                continue;
                
            System.out.print(d + " ");
            a = b;
            b = c;
            c = d;
        }
    }
}

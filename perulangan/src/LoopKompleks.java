public class LoopKompleks {
    public static void main(String[] args) throws Exception {
        for (int a=3; a>=1; a--) {
            for (int b=1; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
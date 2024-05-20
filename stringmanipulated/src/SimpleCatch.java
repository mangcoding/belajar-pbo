public class SimpleCatch {
    public static void main(String[] args) throws Exception {
        try {
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        }catch(Exception e) {
            System.out.println("====================================");
            System.out.println("Error: " + e);
        }finally {
            System.out.println("The 'try catch' is finished.");
        }
        System.out.println("other code executed");
    }
}



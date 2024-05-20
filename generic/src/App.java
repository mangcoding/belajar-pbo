public class App {
    public static void main(String[] args) throws Exception {
        String name = "Nugraha";

        for (int i=0; i<name.length(); i++) {
            for (int x=0; x<name.length(); x++) {
                if (x <= i)
                    System.out.print(name.charAt(x)+" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
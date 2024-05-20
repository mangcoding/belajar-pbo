public class App {
    public static void main(String[] args) throws Exception {
        String name = "MUHAMMADABDULLAH";
        int middle = name.length()/2;
        if (name.length()%2 == 0) {
            middle = (name.length()+1)/2;
        }
        
        for (int i=0; i<name.length(); i++) {
            for (int x=0; x<name.length(); x++) {
                if (i == middle) 
                    System.out.print(name.charAt(x)+ " ");
                else if (x == middle)
                    System.out.print(name.charAt(i)+ " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}

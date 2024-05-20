import java.util.EmptyStackException;
import java.util.Stack;

public class Elektronik {

    public static void main(String[] args) {

        Stack<String> elektronik = new Stack<String>();
        System.out.println("Stack items \t\t\t\t : " + elektronik);
        elektronik.add("TV");
        elektronik.add("Laptop");
        elektronik.add("Rice Cooker");
        elektronik.add("Vacum Cleaner");
        elektronik.add("Fan");

        System.out.println("Stack items \t\t\t\t : " + elektronik);
        System.out.println("Stack size \t\t\t\t : " + elektronik.size());
        System.out.println("Ran exist? \t\t\t\t : " + elektronik.contains("Ran"));

        System.out.println("The location of TV \t\t\t : " + elektronik.search("TV"));
        System.out.println("The location of Laptop \t\t\t : " + elektronik.search("Laptop"));
        System.out.println("The location of Rice Cooker \t\t : " + elektronik.search("Rice Cooker"));
        System.out.println("The location of Vacum Cleaner \t\t : " + elektronik.search("Vacum Cleaner"));
        System.out.println("The location of Fan \t\t\t : " + elektronik.search("Fan"));

        System.out.println("Top Stack \t\t\t\t : " + elektronik.peek());

        System.out.println("Pop, " + elektronik.pop() + "\t\t Stack items \t : " + elektronik);
        System.out.println("Pop, " + elektronik.pop() + "\t Stack items \t : " + elektronik);
        System.out.println("Pop, " + elektronik.pop() + "\t Stack items \t : " + elektronik);

        elektronik.clear();
        System.out.println("Clear the Stack,Stack items \t\t : " + elektronik);
        try {
            elektronik.pop();
        } catch (EmptyStackException e) {
            System.out.println("Empty stack");

        }

    }

}
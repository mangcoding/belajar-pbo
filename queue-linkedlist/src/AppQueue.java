import java.util.LinkedList;
import java.util.Queue;

public class AppQueue {

    public static void main(String[] args) {
        
        // create a queue
        Queue<String> todoList = new LinkedList<>();

        // add items to the todoList
        todoList.add("date");
        todoList.add("cherry");
        todoList.add("apple");
        todoList.add("banana");
        
        // print the todoList
        System.out.println("todoList: " + todoList);
        
        // get the front item of the todoList
        String frontItem = todoList.peek();
        System.out.println("Front item: " + frontItem);
        
        // remove the front item from the todoList
        String removedItem = todoList.remove();
        System.out.println("Removed item: " + removedItem);
        
        // print the todoList again
        System.out.println("todoList: " + todoList);
    }
}
import java.lang.ArithmeticException;

public class SampleThrow {  
    public static void validate(int age) {  
        if(age<18) {  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    public static void main(String args[]){  
        //calling the function 
        try { 
            validate(13); 
        }catch(Exception e) {
            System.out.println("Error: " + e);
        } 
        System.out.println("rest of the code...");    
    }  
}
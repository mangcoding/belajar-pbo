package errorhandling;
public class App {
    public static void main(String[] args) {
        try {
            int age = App.getAge(5000);
            System.out.println("Age: " + age+" tahun");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getAge(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            throw new IllegalArgumentException("Year of birth should be greater than 0");
        }else if (yearOfBirth > 2024) {
            throw new ArithmeticException("Year of birth should be less than 2024");
        }
        int age = 2024 - yearOfBirth;
        return age;
    }
}



public class App {
    public static void main(String[] args) {
        System.out.println("Dasar Java");

        // Deklarasi Variabel
        int a = 5;

        // Operator Aritmatika
        a *=7;
        a /=5;
        a %=4;

        System.out.println(a);

        // calculate age from year of birth
        int yearOfBirth = 1990;
        int yearNow = 2023;
        int age = yearNow - yearOfBirth;
        
        System.out.println(age);
    }
}

public class App {
    public static void main(String[] args) {
        // Input
        Double reamur = 80.00;

        // Process
        Double celcius = 5.00/4 * reamur;
        Double fahrenheit = 9.00/5 * celcius + 32;
        Double kelvin = celcius + 273;

        // Output
        System.out.println("Reamur: " + reamur);
        System.out.println("Celcius: " + celcius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }
}

/*
 * String untuk teks
 * Double untuk angka yang ada komanya
 * Integer untuk angka yang tidak ada komanya
 */
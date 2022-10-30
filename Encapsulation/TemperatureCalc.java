public class TemperatureCalc {
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    static double celsiusToReamur(double celsius) {
        return celsius * 4 / 5;
    }

    static double reamurToCelsius(double reamur) {
        return reamur * 5 / 4;
    }

    static double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4 / 9;
    }

    static double reamurToFahrenheit(double reamur) {
        return reamur * 9 / 4 + 32;
    }

    static double kelvinToReamur(double kelvin) {
        return (kelvin - 273.15) * 4 / 5;
    }

    static double reamurToKelvin(double reamur) {
        return reamur * 5 / 4 + 273.15;
    }
}

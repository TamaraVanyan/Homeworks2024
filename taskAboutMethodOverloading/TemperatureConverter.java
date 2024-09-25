package taskAboutMethodOverloading;
/*Write overloaded convertTemperature methods:
One version accepts a temperature in Celsius and returns it in Fahrenheit.
The other version accepts a temperature in Fahrenheit and returns it in Celsius.*/
public class TemperatureConverter {
    public static void main(String[] args) {

        System.out.println("−273.15°C in Fahrenheit is: " + convertTemperature(-273.15)); // Celsius to Fahrenheit
        System.out.println("90°F in Celsius is: " + convertTemperature(90));               // Fahrenheit to Celsius
    }

    public static double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertTemperature(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
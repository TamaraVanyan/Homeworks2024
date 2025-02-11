package calculator;

public class CalculatorWithMethodReference {
    public static void main(String[] args) {

        CalculateMethods calc = new CalculateMethods();

        Calculator addRef = calc::add;
        Calculator subRef = calc::subtract;
        Calculator mulRef = calc::multiply;
        Calculator divRef = calc::divide;

        try {
            System.out.println("Addition: " + addRef.calculate(10, 5));
        } catch (CalculationException ex) {
            throw new RuntimeException(ex);
        }
        try {
            System.out.println("Subtraction: " + subRef.calculate(10, 5));
        } catch (CalculationException ex) {
            throw new RuntimeException(ex);
        }
        try {
            System.out.println("Multiplication: " + mulRef.calculate(10, 5));
        } catch (CalculationException ex) {
            throw new RuntimeException(ex);
        }
        try {
            System.out.println("Division: " + divRef.calculate(10, 7));
        } catch (CalculationException ex) {
            throw new RuntimeException(ex);
        }
    }
}
package calculator;

public class CalculateMethods implements Calculator {

    @Override
    public double calculate(double a, double b) throws CalculationException {
        return 0;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws CalculationException {
        if (b == 0) throw new CalculationException("Division by zero is not allowed!");
        return a / b;
    }
}
package calculator;

@FunctionalInterface
interface Calculator {
    double calculate(double a, double b) throws CalculationException;
}
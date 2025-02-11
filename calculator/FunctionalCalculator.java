package calculator;

import java.util.Scanner;
/*ստեղծում եք կալկուլյատորի functional interface, իրա calculate մեթոդով, որը ստանումա երկու հատ թիվ ու վերադարձնումա թիվ
ու նաև իրա signature ի մասա կազմում ինչ-որ ձեր սարքած custom checked exception։ Էդ exception ը սխալ պարամետրերի դեպքում
 կօգտագործեք։ Լամբդաներով իմպլեմենտ եք անում չորս տարբեր մաթեմատիկական օպերացիաները համապատասխանաբար ու կիրառում եք։ */
public class FunctionalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Type first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Type operation symbol(+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Type second number: ");
            double num2 = scanner.nextDouble();

            Calculator addition = (a, b) -> a + b;
            Calculator subtraction = (a, b) -> a - b;
            Calculator multiplication = (a, b) -> a * b;
            Calculator division = (a, b) -> {
                if (b == 0) throw new CalculationException("Division by zero is not allowed!");
                return a / b;
            };

            double result;

            switch (operator) {
                case '+':
                    result = addition.calculate(num1, num2);
                    break;
                case '-':
                    result = subtraction.calculate(num1, num2);
                    break;
                case '*':
                    result = multiplication.calculate(num1, num2);
                    break;
                case '/':
                    result = division.calculate(num1, num2);
                    break;
                default:
                    throw new CalculationException("Wrong input!! Type only one of +, -, *, / symbols:");
            }

            System.out.println("Result: " + num1 + operator + num2 + " = " + result);

        } catch (CalculationException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wrong input please type walid data:");
        } finally {
            scanner.close();
        }
    }
}
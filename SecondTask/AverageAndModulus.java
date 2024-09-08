package SecondTask;

import java.util.Scanner;
public class AverageAndModulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first short number:");
        short num1 = scanner.nextShort();

        System.out.println("Enter the second short number:");
        short num2 = scanner.nextShort();

        System.out.println("Enter the third short number:");
        short num3 = scanner.nextShort();

        int average = (num1 + num2 + num3) / 3;

        int sumOfAbsValues = Math.abs(num1) + Math.abs(num2) + Math.abs(num3);
        double result = (double) sumOfAbsValues / average;

        System.out.println("The result is: " + result);

        scanner.close();
    }
}
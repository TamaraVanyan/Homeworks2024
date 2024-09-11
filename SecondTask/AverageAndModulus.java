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

        int absNum1;
        if (num1 < 0) {
            absNum1 = -1 * num1;
        } else {
            absNum1 = num1;
        }

        int absNum2;
        if (num2 < 0) {
            absNum2 = -1 * num2;
        } else {
            absNum2 = num2;
        }

        int absNum3;
        if (num3 < 0) {
            absNum3 = -1 * num3;
        } else {
            absNum3 = num3;
        }
        int sumOfAbsValues = absNum1 + absNum2 + absNum3;
        if (average != 0) {
            double result = (double) sumOfAbsValues / average;
            System.out.println("The result is: " + result);
        } else {
            System.out.println("The average is zero, division cannot be performed.");
        }
        scanner.close();
    }
}
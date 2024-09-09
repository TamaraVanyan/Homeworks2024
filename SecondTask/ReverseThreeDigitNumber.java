package SecondTask;

import java.util.Scanner;

public class ReverseThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit positive number:");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("The input is not a valid three-digit positive number.");
            System.exit(1);
        }
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        int reversedNumber = digit3 * 100 + digit2 * 10 + digit1;

        if (reversedNumber < 100) {
            System.out.println("It is not possible to form a valid three-digit number by reversing.");
            System.exit(2);
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
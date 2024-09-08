package SecondTask;
import java.util.Scanner;
public class ForthDigitNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input four digit number: ");
            int number = scanner.nextInt();
            if (number >= 1000 && number <= 9999) {
                int digit1 = number / 1000;
                int digit2 = (number / 100) % 10;
                int digit3 = (number / 10) % 10;
                int digit4 = number % 10;

                System.out.println("Digits: " + digit1 + ", " + digit2 + ", " + digit3 + ", " + digit4);
            } else {
                System.out.println("This number should include 4 digites.");
                System.exit(2);
            }
        }

}

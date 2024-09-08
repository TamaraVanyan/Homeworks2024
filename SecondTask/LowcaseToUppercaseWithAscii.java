package SecondTask;

import java.util.Scanner;
public class LowcaseToUppercaseWithAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input lowercase from English alphabet: ");
        char lowercase = scanner.next().charAt(0);
        if (lowercase >= 'a' && lowercase <= 'z') {

            char uppercase = (char) (lowercase - 32);
            System.out.println("Uppercase՝ " + uppercase);
        } else {
            System.out.println("This is not lowercase from English alphabet.");
            System.exit(2);
        }
    }
}

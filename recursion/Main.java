package recursion;

import static recursion.BinaryConverter.toBinary;

public class Main {
    public static void main(String[] args) {
        try {
            int num1 = 18;
            System.out.println("Binary of " + num1 + ": " + toBinary(num1));

            int num2 = 1;
            //int num2 = 0;
            System.out.println("Binary of " + num2 + ": " + toBinary(num2));

            int num3 = -5;
            System.out.println("Binary of " + num3 + ": " + toBinary(num3));
        } catch (NegativeNumException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

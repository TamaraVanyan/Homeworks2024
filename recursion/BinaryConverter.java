package recursion;

public class BinaryConverter {
    public static String toBinary(int number) throws NegativeNumException {
        if (number < 0) {
            throw new NegativeNumException("Number cannot be negative: " + number);
        }
        if (number == 0) {
            return "0";
        }
        if (number == 1) {
            return "1";
        }
        return toBinary(number / 2) + (number % 2);
    }
}

package generics;
import java.util.ArrayList;
import java.util.Arrays;

public class IntergerFromArrList {
    public static void main(String[] args) {
        ArrayList<Number> mixedNumbers = new ArrayList<>(Arrays.asList(12, 45.02, 7.5, 3, 6.75, -7, 0));

        ArrayList<Integer> integers = getIntegersFromArrayList(mixedNumbers);

        System.out.println("Array list with integer numbers: " + integers);
    }
    public static ArrayList<Integer> getIntegersFromArrayList(ArrayList<Number> numbers) {
        ArrayList<Integer> integers = new ArrayList<>();

        if (numbers == null || numbers.isEmpty()) {
            return integers;
        }

        for (Number num : numbers) {
            if (num.doubleValue() == num.intValue()) {
                integers.add(num.intValue());
            }
        }
        return integers;
    }
}
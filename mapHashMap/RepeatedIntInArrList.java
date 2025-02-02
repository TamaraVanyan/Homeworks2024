package mapHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatedIntInArrList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 2, 8, 10, -100, -100, 0, 1, 8, 18, -5, 5, 8, 8, 8));

        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : numbers) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        for (Integer num : countMap.keySet()) {
            if (countMap.get(num) > 1) {
                System.out.println("Number " + num + " repeated " + countMap.get(num) + " times.");
            }
        }
    }
}
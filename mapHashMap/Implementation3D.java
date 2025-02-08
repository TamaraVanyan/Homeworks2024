package mapHashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Implementation3D {
    public static void main(String[] args) {
        Map<Points3D, String> hashMap = new HashMap<>();
        hashMap.put(new Points3D(-1, 5, 0, "red"), "Gago");
        hashMap.put(new Points3D(-1, 5, 0, "red"), "Gagik"); // diferent between 1 & 2 only name
        hashMap.put(new Points3D(4.2, -10, 3.4, "blue"), "Vazgen");
        hashMap.put(new Points3D(0, 0.01, 100, "green"), "Anna");
        hashMap.put(new Points3D(-20, 5.01, 0, "green"), "Exo");

        TreeMap<Points3D, String> treeMap = new TreeMap<>(hashMap);

        for (Map.Entry<Points3D, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Map<String, Points3D> swappedMap = ReplaceKeyValue.replaceKeyValue(hashMap);
        System.out.println("_____________________________");
        System.out.println("Replaced HashMap:");
        for (Map.Entry<String, Points3D> entry : swappedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
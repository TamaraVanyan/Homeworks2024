package mapHashMap;

import java.util.HashMap;
import java.util.Map;

public class ReplaceKeyValue {
    public static Map<String, Points3D> replaceKeyValue(Map<Points3D, String> originalMap) {

        Map<String, Points3D> replacedMap = new HashMap<>();

        for (Map.Entry<Points3D, String> entry : originalMap.entrySet()) {
            replacedMap.put(entry.getValue(), entry.getKey());
        }
        return replacedMap;
    }
}
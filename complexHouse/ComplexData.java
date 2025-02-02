package complexHouse;

import java.util.HashMap;
import java.util.Map;

public class ComplexData {
    private final Map<HousingComplex, String> complexMap = new HashMap<>();

    public void addComplex(HousingComplex complex) {
        complexMap.put(complex, complex.getAddress());
    }

    public String getAddress(HousingComplex complex) {
        if (!complexMap.containsKey(complex)) {
            throw new ComplexNotFoundException("Complex not found");
        }
        return complexMap.get(complex);
    }
}
package complexHouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HousingComplex {
    private String address;
    private List<Building> buildings;

    public HousingComplex(String address, List<Building> buildings) {
        this.address = address;
        this.buildings = new ArrayList<>(buildings);
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HousingComplex that = (HousingComplex) obj;
        return Objects.equals(address, that.address) && Objects.equals(buildings, that.buildings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, buildings);
    }
}
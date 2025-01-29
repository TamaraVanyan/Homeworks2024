package complexHouse;

import java.util.List;
import java.util.ArrayList;

public class Building {
    private int floors;
    private int parkingArea;
    private List<Apartment> apartments;

    public Building(int floors, int parkingArea, List<Apartment> apartments) {
        this.floors = floors;
        this.parkingArea = parkingArea;
        this.apartments = new ArrayList<>(apartments);
    }
}
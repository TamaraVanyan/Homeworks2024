package complexHouse;

public class Apartment {
    private int rooms;
    private double area;
    private boolean hasBalcony;
    private int floor;

    public Apartment(int rooms, double area, boolean hasBalcony, int floor) {
        this.rooms = rooms;
        this.area = area;
        this.hasBalcony = hasBalcony;
        this.floor = floor;
    }
}
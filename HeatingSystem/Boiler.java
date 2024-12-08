package HeatingSystem;

class Boiler {
    private String brand;
    private String type;
    private double waterCapacity;
    private int efficiency;
    private double pressure;

    public Boiler(String brand, String type, double waterCapacity, int efficiency, double pressure) {
        this.brand = brand;
        this.type = type;
        this.waterCapacity = waterCapacity;
        this.efficiency = efficiency;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Boiler" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", efficiency=" + efficiency +
                "%, waterCapacity=" + waterCapacity +
                "L, pressure=" + pressure + " bar";
    }
}
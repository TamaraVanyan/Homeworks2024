package HeatingSystem;

class HeatingSystem {
    private String houseType;
    private double houseArea;
    private Boiler boiler;
    private final double ELECTRICITY_COST_PER_MONTH = 1000;

    public HeatingSystem(String houseType, double houseArea, Boiler boiler) {
        this.houseType = houseType;
        this.houseArea = houseArea;
        this.boiler = boiler;
    }

    private int getAverageTemperature(String month) {
        switch (month) {
            case "January": return -2;
            case "February": return 1;
            case "March": return 5;
            case "April": return 15;
            case "May": return 20;
            case "June": return 25;
            case "July": return 30;
            case "August": return 28;
            case "September": return 18;
            case "October": return 10;
            case "November": return 7;
            case "December": return -1;
            default: return 0;
        }
    }

    public double calculateGasCost(String month) {
        int avgTemp = getAverageTemperature(month);
        double baseCost = 45 * houseArea;
        double tempFactor = (40 - avgTemp) / 20.0;
        return Math.round(baseCost * tempFactor * 100.0) / 100.0;
    }

    public double calculateElectricityCost() {
        return ELECTRICITY_COST_PER_MONTH;
    }

    @Override
    public String toString() {
        return "HeatingSystem" +
                "houseType='" + houseType + '\'' +
                ", houseArea=" + houseArea +
                " m², boiler=" + boiler;
    }
}
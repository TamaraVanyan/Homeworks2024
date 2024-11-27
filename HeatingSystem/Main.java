package HeatingSystem;

public class Main {
    public static void main(String[] args) {

        Boiler boiler = new Boiler("Bosch", "Gas", 300, 95, 2.0);

        HeatingSystem heatingSystem = new HeatingSystem("Apartment", 60, boiler);

        System.out.println(heatingSystem);

        String month = "February";
        System.out.println("Gas cost for " + month + ": " + heatingSystem.calculateGasCost(month) + " AMD");
        System.out.println("Electricity cost for " + month + ": " + heatingSystem.calculateElectricityCost() + " AMD");

        month = "July";
        System.out.println("Gas cost for " + month + ": " + heatingSystem.calculateGasCost(month) + " AMD");
        System.out.println("Electricity cost for " + month + ": " + heatingSystem.calculateElectricityCost() + " AMD");
    }
}
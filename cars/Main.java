package cars;

public class Main {
    public static void main(String[] args) {

        Vehicle diesel = new DieselMotorCar("BMW Diesel", 2020);
        Vehicle fuel = new FuelMotorCar("Mercedes Fuel", 2024);
        Vehicle hybrid = new HybridElectroCar("Tesla cibertruk", 2023, false);
        Vehicle hybrid1 = new HybridElectroCar("Volt Esiminch", 2019, true);
        Vehicle motorCycle = new MotorCycle("Ford", 2021);

        diesel.displayInfo();
        diesel.startDriving();
        System.out.println("___________________________");
        fuel.displayInfo();
        fuel.startDriving();

        System.out.println("______________________________");
        motorCycle.displayInfo();
        motorCycle.startDriving();
        System.out.println("______________________");
        hybrid.startDriving();
        hybrid.displayInfo();
        ((HybridElectroCar) hybrid).activateAutopilot();
        System.out.println("__________________________");
        hybrid1.startDriving();
        hybrid1.displayInfo();
        ((HybridElectroCar) hybrid1).activateAutopilot();
    }
}

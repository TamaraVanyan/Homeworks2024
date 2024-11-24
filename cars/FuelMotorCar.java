package cars;

public class FuelMotorCar extends Car implements GasSupport {
    private boolean isGasOn = false;

    public FuelMotorCar(String model, int releaseYear) {
        super(model, releaseYear);
    }

    @Override
    public void startDriving() {
        if (isGasOn) {
            System.out.println("Fuel motor car is starting with gas.");
        } else {
            System.out.println("Fuel motor car is starting with fuel engine.");
        }
    }

    @Override
    public void switchToGas() {
        isGasOn = true;
        System.out.println("Fuel motor car switched to gas.");
    }
}
package cars;

public class DieselMotorCar extends Car {
    public DieselMotorCar(String model, int releaseYear) {
        super(model, releaseYear);
    }

    @Override
    public void startDriving() {
        System.out.println("Diesel motor car is starting with diesel engine.");
    }
}
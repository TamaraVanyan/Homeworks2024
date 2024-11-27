package cars;

public class MotorCycle implements Vehicle {
    private String model;
    private int releaseYear;

    public MotorCycle(String model, int releaseYear) {
        this.model = model;
        this.releaseYear = releaseYear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model: " + model + " Release Year: " + releaseYear +
                " Type: " + this.getClass().getSimpleName());
    }

    @Override
    public void startDriving() {
        System.out.println("Motorcycle is starting engine.");
    }
}
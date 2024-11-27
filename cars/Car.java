package cars;

public abstract class Car implements Vehicle {
    private String model;
    private int releaseYear;

    public Car(String model, int releaseYear) {
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void displayInfo() {
        System.out.println("Model: " + model + " Release Year: " + releaseYear + " Type: " + this.getClass().getSimpleName());
    }

    public abstract void startDriving();
}

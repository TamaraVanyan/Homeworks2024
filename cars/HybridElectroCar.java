package cars;

public class HybridElectroCar extends Car implements Autopilot {
    private boolean isFuel = false;

    public HybridElectroCar(String model, int releaseYear, boolean isFuel) {
        super(model, releaseYear);
        this.isFuel = isFuel;
    }

    public boolean isFuel() {
        return isFuel;
    }

    @Override
    public void startDriving() {
        if (isFuel) {
            System.out.println("Hybrid car is starting with fuel.");
        } else {
            System.out.println("Hybrid car is starting with electric motor.");
        }
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Hybrid car is driving with autopilot.");
    }
}
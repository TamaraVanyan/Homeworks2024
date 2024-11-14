package building;

public class Building {
    private int voltage;
    private int drainageSystemOuts;

    public Building(int voltage, int drainageSystemOuts) {
        this.voltage = voltage;
        this.drainageSystemOuts = drainageSystemOuts;
    }

    public int getVoltage() {
        return voltage;
    }

    public int getDrainageSystemOuts() {
        return drainageSystemOuts;
    }
}

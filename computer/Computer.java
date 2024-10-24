package computer;

public class Computer {
    private static int nextId = 1;
    private int id;
    private int storage;
    private int ram;

    public Computer(int storage, int ram) {
        if (storage > 2048) {
            storage = 2048;
        }
        if (ram > 64) {
            ram = 64;
        }
        this.id = nextId++;
        this.storage = storage;
        this.ram = ram;
    }

    public static Computer generateMegaComputer(int storage, int ram) {
        Computer megaComputer = new Computer(0, 0);
        megaComputer.id = nextId++;
        megaComputer.storage = storage;
        megaComputer.ram = ram;
        return megaComputer;
    }

    public int getId() {
        return id;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }
}
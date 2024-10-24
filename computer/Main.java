package computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(516, 32);
        Computer computer2 = new Computer(1024, 64);

        Computer megaComputer = Computer.generateMegaComputer(5000, 128);

        printComputerDetails(computer1);
        printComputerDetails(computer2);
        printComputerDetails(megaComputer);
    }

    public static void printComputerDetails(Computer computer) {
        System.out.println("Computer ID: " + computer.getId() + ", Storage: " + computer.getStorage() + " GB" +
                ", RAM: " + computer.getRam() + " GB");
    }
}
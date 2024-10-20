package classesFirstTask;

public class Home {
    private double livingRoom;
    private double kitchen;
    private double bedroom;
    private double bathroom;

    public Home(double livingRoom, double kitchen, double bedroom, double bathroom) {
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.bathroom = bathroom;

    }

    public Home(double livingRoom, double kitchen, double bedroom) {
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.bathroom = 6;
    }

    public void printHomeSizes() {
        if (livingRoom <= 0 || kitchen <= 0 || bedroom <= 0) {
            System.out.println("Size must be a positive numbers");
            return;
        }
        System.out.println("Living room size: " + livingRoom);
        System.out.println("Kitchen size: " + kitchen);
        System.out.println("Badroom size: " + bedroom);
        System.out.println("Bathroom size: " + bathroom);

    }

    public static void main(String[] args) {
        Home home1 = new Home(-40, 30, 25, 4);
        home1.printHomeSizes();
        System.out.println("_________________________________________________");

        Home home2 = new Home(20, 20, 8);
        home2.printHomeSizes();
        System.out.println("______________________________________________________");

        Home home3 = new Home(30, 10, 250, 1);
        home3.printHomeSizes();
        System.out.println("_________________________________________________");

        Home home4 = new Home(70, 30, -6);
        home4.printHomeSizes();
    }
}
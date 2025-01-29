package complexHouse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Apartment apt1 = new Apartment(3, 90.5, true, 2);
        Apartment apt2 = new Apartment(2, 62, false, 3);
        Apartment apt3 = new Apartment(1, 42, true, 1);

        Building building1 = new Building(10, 20, Arrays.asList(apt1, apt2));
        Building building2 = new Building(11, 30, Arrays.asList(apt3));

        HousingComplex complex1 = new HousingComplex("Syunik 42, Goris", Arrays.asList(building1, building2));
        HousingComplex complex2 = new HousingComplex("Mashtoc 100, Goris", Arrays.asList(building1));
        HousingComplex complex3 = new HousingComplex("Vardan Mamikonyan, Goris", Arrays.asList(building2));

        ComplexData complexData = new ComplexData();
        complexData.addComplex(complex1);
        complexData.addComplex(complex2);

        try {
            System.out.println("Address of complex1: " + complexData.getAddress(complex1));
            System.out.println("Address of complex2: " + complexData.getAddress(complex2));
            System.out.println("Address of complex3: " + complexData.getAddress(complex3));  // complex3 չի ավելացվել, սա կհանգեցնի Exception
        } catch (ComplexNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
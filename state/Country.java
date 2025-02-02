package state;

public class Country {
    String name;
    String anthem;
    String emblem;
    String flag;
    int population;
    double area;

    public Country(String name, String anthem, String emblem, String flag, int population, double area) {
        this.name = name;
        this.anthem = anthem;
        this.emblem = emblem;
        this.flag = flag;
        this.population = population;
        this.area = area;
    }

    public String getEmblem() {
        return emblem;
    }

    public String getAnthem() {
        return anthem;
    }

    public String getFlag() {
        return flag;
    }
}
package state;

import java.util.LinkedList;
import static state.RemoveDuplicates.removeDuplicates;

public class DuplicatesChecking {
    public static void main(String[] args) {
        LinkedList<Country> countries = new LinkedList<>();

        countries.add(new Country("Armenia", "Mer Hayrenik", "Zinanshan", "Eraguyn", 3000000, 29783));
        countries.add(new Country("Mozambik", "Mozanbiki orhnerg", "Mozanbiki gerb", "Mozanbiki drosh", 31255435, 801590));
        countries.add(new Country("Armenia", "Mer Hayrenik", "Zinanshan", "Eraguyn", 3000000, 29783));
        countries.add(new Country("Mozambig", "Mozanbiki orhnerg", "Mozanbiki gerb", "Mozanbiki drosh", 31255435, 801590));
        countries.add(new Country("Mozambik", "Urishi orhnerg", "Mozanbiki gerb", "Urishi drosh", 31255435, 801590));

        removeDuplicates(countries);

        for (Country country : countries) {
            System.out.println(country.name + " " + country.anthem + " " + country.emblem + " " + country.flag);
        }
    }

}
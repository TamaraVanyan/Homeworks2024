package state;

import java.util.LinkedList;

public class RemoveDuplicates {

    public static void removeDuplicates(LinkedList<Country> countries) {
        for (int i = 0; i < countries.size(); i++) {

            for (int j = i + 1; j < countries.size(); j++) {
                if (countries.get(i).getAnthem().equals(countries.get(j).getAnthem())
                        && countries.get(i).getEmblem().equals(countries.get(j).getEmblem()) &&
                        countries.get(i).getFlag().equals(countries.get(j).getFlag())) {
                    countries.remove(j);
                    j--;
                }
            }
        }
    }
}

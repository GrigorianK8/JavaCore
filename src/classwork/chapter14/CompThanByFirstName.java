package classwork.chapter14;

import java.util.Comparator;

public class CompThanByFirstName implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}
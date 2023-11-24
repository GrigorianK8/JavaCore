package classwork.chapter14;

import java.util.Comparator;

public class TComp implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        int i, j, k;
        i = aStr.indexOf(' ');
        j = bStr.indexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));
        if (k == 0) {
            return aStr.compareTo(bStr);
        } else
            return k;
    }
}
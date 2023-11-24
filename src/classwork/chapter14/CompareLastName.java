package classwork.chapter14;

import java.util.Comparator;

public class CompareLastName implements Comparator<String> {

    public int compare(String aStr, String bStr) {
        int i, j;
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareTo(bStr.substring(j));
    }
}
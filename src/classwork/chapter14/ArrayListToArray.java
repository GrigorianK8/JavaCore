package classwork.chapter14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Possession of the list array al: " + al);

        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;

        for (int i : ia) {
            sum += i;
        }
        System.out.println("Summation: " + sum);
    }
}
package classwork.chapter14;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {

        List<Integer> vals = new ArrayList<>();

        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        System.out.print("The original contents of the list array vals: ");

        for (int v : vals) {
            System.out.print(v + " ");
        }
        System.out.println();

        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("Sum of numerical values: " + sum);
    }
}
package classwork.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

    public static void main(String[] args) {

        List<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("The contents of the list array vals: ");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n))) ;
        System.out.println();

        spltitr = vals.spliterator();
        List<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        System.out.println("The contents of the list array sqr: ");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
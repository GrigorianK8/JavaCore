package classwork.chapter14;

import java.util.Set;
import java.util.TreeSet;

public class CompDemo {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>((aStr, bStr) -> aStr.compareTo(bStr));

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        for (String element : treeSet) {
            System.out.print(element + " ");
            System.out.println();
        }
    }
}
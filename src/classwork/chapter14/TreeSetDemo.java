package classwork.chapter14;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        System.out.println(treeSet);
        System.out.println(((TreeSet<String>) treeSet).subSet("C", "F"));
    }
}
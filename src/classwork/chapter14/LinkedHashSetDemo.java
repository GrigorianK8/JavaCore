package classwork.chapter14;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Betta");
        linkedHashSet.add("Alfa");
        linkedHashSet.add("Eta");
        linkedHashSet.add("Gamma");
        linkedHashSet.add("Epsilon");
        linkedHashSet.add("Omega");

        System.out.println(linkedHashSet);
    }
}
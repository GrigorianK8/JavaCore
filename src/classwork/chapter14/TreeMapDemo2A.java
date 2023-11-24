package classwork.chapter14;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {

    public static void main(String[] args) {

        CompareLastName compLN = new CompareLastName();
        Comparator<String> compLastThenFirs = compLN.thenComparing(new CompThanByFirstName());

        Map<String, Double> treeMap = new TreeMap<>();

        treeMap.put("John Dou", (3434.34));
        treeMap.put("Tom Smith", (123.22));
        treeMap.put("Jein Baker", (1378.00));
        treeMap.put("Tod Holl", (99.22));
        treeMap.put("Ralf Smith", (-19.08));

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        double balance = treeMap.get("John Dou");
        treeMap.put("John dou", balance + 1000);
        System.out.println(treeMap.get("John dou"));
    }
}
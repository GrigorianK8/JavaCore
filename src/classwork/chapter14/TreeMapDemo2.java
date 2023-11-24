package classwork.chapter14;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

    public static void main(String[] args) {

        Map<String, Double> treeMap = new TreeMap<>();

        treeMap.put("John Dou", (3434.34));
        treeMap.put("Tom Smith", (123.22));
        treeMap.put("Jein Baker", (1378.00));
        treeMap.put("Tod Holl", (99.22));
        treeMap.put("Ralf Smith", (-19.08));

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> map : set) {
            System.out.print(map.getKey() + ": ");
            System.out.println(map.getValue());
        }
        System.out.println();

        double balance = treeMap.get("John Dou");
        treeMap.put("John Dou", balance + 1000);
        System.out.println("John Doe's new account balance: " + treeMap.get("John Dou"));
    }
}
package classwork.chapter14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, Double> hashMap = new HashMap<>();

        hashMap.put("John Dou", (3434.34));
        hashMap.put("Tom Smith", (123.22));
        hashMap.put("Jein Baker", (1378.00));
        hashMap.put("Tod Holl", (99.22));
        hashMap.put("Ralf Smith", (-19.08));

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hashMap.get("John Dou");
        hashMap.put("John Dou", balance + 1000);
        System.out.println("John Doe's new account balance: " + hashMap.get("John Dou"));
    }
}
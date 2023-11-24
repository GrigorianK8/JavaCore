package classwork.chapter14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> al = new ArrayList<>();

        System.out.println("initial size of the list array al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("The size of the list array al after entering the elements: " + al.size());
        System.out.println("Possession of the list array al: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("Size of the list array al after deleting the elements: " + al.size());
        System.out.println("Possession of the list array al: " + al);
    }
}
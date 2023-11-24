package classwork.chapter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        System.out.print("The initial contents of the list array al: ");
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> lItr = arrayList.listIterator();
        while (lItr.hasNext()) {
            String element = lItr.next();
            lItr.set(element + "+");
        }

        System.out.print("Modified contents of the list array al: ");
        itr = arrayList.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Reversely modified list: ");
        while (lItr.hasPrevious()) {
            String element = lItr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
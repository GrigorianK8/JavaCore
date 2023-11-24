package classwork.chapter14;

import java.util.LinkedList;
import java.util.List;


public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("The original contents of the linked list 11: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of linked list 11 after deleting items: " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("The contents of the linked list 11 after removing the first and last elements: " + ll);

        String value = ll.get(2);
        ll.set(2, value + " changed");
        System.out.println("Contents of linked list 11 after the change: " + ll);
    }
}
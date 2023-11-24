package classwork.chapter14;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.print("Stack extraction: ");

       while (arrayDeque.peek() != null) {
           System.out.print(arrayDeque.pop() + " ");
       }
    }
}
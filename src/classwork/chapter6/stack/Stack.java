package classwork.chapter6.stack;

public class Stack {
    private int[] stck = new int[10];
    private int index;

    public Stack() {

        index = -1;
    }

    public void push(int item) {
        if (index == 9)
            System.out.println("The stack is full.");
        else
            stck[++index] = item;
    }

    public int pop(int item) {
        if (index < 0) {
            System.out.println("The stack is not loaded.");
            return 0;
        } else {
            return stck[index--];
        }
    }
    public int getIndex() {
        return index;
    }
}
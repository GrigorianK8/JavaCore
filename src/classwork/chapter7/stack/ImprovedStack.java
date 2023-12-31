package classwork.chapter7.stack;

public class ImprovedStack {
    private int[] stck;
    private int tos;

    ImprovedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else
            return stck[tos--];
    }
}
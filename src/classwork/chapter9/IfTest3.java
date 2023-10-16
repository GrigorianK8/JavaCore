package classwork.chapter9;

public class IfTest3 {

    public static void main(String[] args) {
        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        myStack = ds;
        for (int i = 0; i < 12; i++) myStack.push(i);

        myStack = fs;
        for (int i = 0; i < 8; i++) myStack.push(i);

        myStack = ds;
        System.out.println("Values in the dynamic stack:");
        for (int i = 0; i < 12; i++) {
            System.out.println(myStack.pop());
        }

        myStack = fs;
        System.out.println("Values in the fixed stack:");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack.pop());
        }
    }
}
package classwork.chapter9;

public class IfTest {

    public static void main(String[] args) {

        FixedStack myStack = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) myStack.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        System.out.println("Stack in myStack: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack.pop());
        }

        System.out.println("Stack in myStack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
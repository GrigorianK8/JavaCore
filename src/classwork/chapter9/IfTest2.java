package classwork.chapter9;

public class IfTest2 {

    public static void main(String[] args) {
        DynStack myStack = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for (int i = 0; i < 12; i++) myStack.push(i);
        for (int i = 0; i < 20; i++) myStack2.push(i);

        System.out.println("Stack in myStack:");
        for (int i = 0; i < 12; i++) {
            System.out.println(myStack.pop());
        }

        System.out.println("Stack in myStack2:");
        for (int i = 0; i < 20; i++) {
            System.out.println(myStack2.pop());
        }
    }
}
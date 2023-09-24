package classwork.chapter7.stack;

public class TestStack2 {

    public static void main(String[] args) {
        ImprovedStack mystack = new ImprovedStack(5);
        ImprovedStack mystack2 = new ImprovedStack(8);

        for (int i = 0; i < 5; i++) mystack.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        System.out.println("Stack in mystack");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack.pop());

        System.out.println("Stack in mystack2");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
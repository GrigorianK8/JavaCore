package classwork.chapter7.stack;

public class TestStack {

    public static void main(String[] args) {

        Stack mystack = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystack.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Stack in mystack:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack.pop());

        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

//        these operators are not valid
//        mystack.tos = -2;
//        mystack2.stck[3] = 100;
    }
}
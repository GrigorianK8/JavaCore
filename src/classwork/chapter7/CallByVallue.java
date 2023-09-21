package classwork.chapter7;

public class CallByVallue {
    public static void main(String[] args) {
        CallValueTest ob = new CallValueTest(15, 20);

        int a = 15, b = 20;

        System.out.println("a and b before the call: "
                + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("a and b after the call: "
                + ob.a + " " + ob.b);
    }
}
package classwork.chapter7;

public class RetOb {
    public static void main(String[] args) {
        RetTest ob = new RetTest(2);
        RetTest ob2;

        ob2 = ob.incrByTen();
        System.out.println("ob.a: " + ob.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after the second increase in value: "
                + ob2.a);
    }
}
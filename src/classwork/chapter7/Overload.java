package classwork.chapter7;

public class Overload {
    public static void main(String[] args) {
//        OverloadDemo ob = new OverloadDemo();
//        double result;
//
//        ob.test();
//        ob.test(10);
//        ob.test(10, 20);
//        result = ob.test(123.25);
//        System.out.println(
//                "Call result ob.test(123.25): " + result);
        OverloadTest ob = new OverloadTest();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);
    }
}
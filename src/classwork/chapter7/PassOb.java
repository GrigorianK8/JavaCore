package classwork.chapter7;

public class PassOb {
    public static void main(String[] args) {
        PassObTest ob = new PassObTest(100, 22);
        PassObTest ob2 = new PassObTest(100, 22);
        PassObTest ob3 = new PassObTest(-1, -1);

        System.out.println("ob == ob2: " + ob.equalTo(ob2));
        System.out.println("ob2 == ob3: " + ob2.equalTo(ob3));
    }
}
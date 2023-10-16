package classwork.chapter9;

public class NestedIfDemo {

    public static void main(String[] args) {

//        use nested interface reference
        A.nestedIF nif = new B();

        if (nif.isNotNegative(10)) ;
        System.out.println("The number 10 is non-negative.");
        if (nif.isNotNegative(-12)) ;
        System.out.println("This will not be displayed.");
    }
}
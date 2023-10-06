package classwork.chapter8;

public class SimpleInheritance {

    public static void main(String[] args) {
        InheritanceA superOb = new InheritanceA();
        InheritanceB subOb = new InheritanceB();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contains place superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contains place subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Sum i, j and k in in object subOb");
        subOb.sum();
    }
}
package classwork.chapter7;

public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ... v):" +
                "Quantity of arguments: " + v.length + " content: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ... v) " +
                "Quantity of arguments: " + v.length + " content: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
//        vaTest();   // Error: Ambiguity
    }
}
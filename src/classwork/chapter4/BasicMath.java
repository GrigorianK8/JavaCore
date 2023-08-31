package classwork.chapter4;

//arithmetic operations
//on integer values
public class BasicMath {
    public static void main(String[] args) {
        System.out.println("integer arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //arithmetic operations on double values
        System.out.println("\nFloating point arithmetic");
        double da = 1 + 1;
        double bd = da * 3;
        double dc = bd / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("bd = " + bd);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}

package classwork.chapter4;

//Demonstrate the ternary operation ?
public class ClassTernary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; //et absolute
        //value of i variable
        System.out.print("Absolute value ");
        System.out.println(i + "equals" + k);

        i = -10;
        k = i < 0 ? -i : i; //et absolute
        //value of i variable
        System.out.print("Absolute value ");
        System.out.println("Absolute value ");
        System.out.println(i + "equals" + k);
    }
}

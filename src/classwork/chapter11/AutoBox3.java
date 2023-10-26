package classwork.chapter11;

public class AutoBox3 {

    public static void main(String[] args) {

        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Initial value iOb: " + iOb);

        ++iOb;
        System.out.println("After ++iOb" + iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("Ob2 after the expression: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i after the expression: " + i);
    }
}
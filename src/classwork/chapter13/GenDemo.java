package classwork.chapter13;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iob;

        iob = new Gen<Integer>(88);
        iob.showTipe();

        int v = iob.getOb();
        System.out.println("Value: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<String>("Generalization Test.");
        strOb.showTipe();

        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
}
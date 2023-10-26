package classwork.chapter11;

public class EnumDemo2 {

    public static void main(String[] args) {
        Apple ap;

        System.out.println("Constants of enumerated type Apple:");

        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);
        }
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("The variable ap contains " + ap);
    }
}
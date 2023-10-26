package classwork.chapter11;

public class EnumDemo3 {

    public static void main(String[] args) {

        Apple ap;

        System.out.println("A Winesap apple is worth " +
                Apple.Winesap.getPrice() + " cents.");

        System.out.println("The prices of all varieties of apples.");
        System.out.println();
        for (Apple a : Apple.values()) {
            System.out.println(a + " worth" + a.getPrice() + " cents");
        }
    }
}
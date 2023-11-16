package classwork.chapter13;

public class HierDemo {

    public static void main(String[] args) {

        Gen2<String, Integer> x = new Gen2<String, Integer>("The value is equal:", 99);

        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
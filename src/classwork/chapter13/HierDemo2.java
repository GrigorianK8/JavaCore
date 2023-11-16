package classwork.chapter13;

public class HierDemo2 {

    public static void main(String[] args) {

        Gen<String> w = new Gen<String>("Welcome", 47);
        System.out.println(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
package classwork.chapter13;

public class SimpGen {

    public static void main(String[] args) {


        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generalizations.");

        tgObj.showTypes();

        int v = tgObj.getOb();
        System.out.println("Value: " + v);

        String str = tgObj.getOb2();
        System.out.println("Value: " + str);
    }
}
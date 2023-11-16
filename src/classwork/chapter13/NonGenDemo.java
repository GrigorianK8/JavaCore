//package classwork.chapter13;
//
//public class NonGenDemo {
//
//    public static void main(String[] args) {
//
//        NonGen iOb;
//
//        iOb = new NonGen(88);
//        iOb.showType();
//
//        int v = (Integer) iOb.getOb();
//        System.out.println("Value: " + v);
//        System.out.println();
//
//        NonGen strOb = new NonGen("A test without generalizations.");
//
//        String str = (String) strOb.getOb();
//        System.out.println("Value: " + str);
//
//        iOb = strOb;
//        v = (Integer) iOb.getOb();
//    }
//}
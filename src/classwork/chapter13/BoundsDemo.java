package classwork.chapter13;

public class BoundsDemo {

    public static void main(String[] args) {

        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("The average value of iob is " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = iob.average();
        System.out.println("The average value of dob is " + w);

//        that code will not compile, because the String class
//        String[] strs = {"1", "2", "3", "4", "5"};
//        String <String> strob = new Stats<String>(strs);
//        double x = strob.average();
//        System.out.println("The average value of strdob is " + x);
    }
}
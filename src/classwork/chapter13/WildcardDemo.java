package classwork.chapter13;

public class WildcardDemo {

    public static void main(String[] args) {

        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("The average value of iob is " + v);

        Double[] dnums = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("The average value of dob is " + w);

        Float[] fnums = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x = fob.average();
        System.out.println("The average value of fob is " + x);

        System.out.println("The average value of iob and dob ");
        if (iob.sameAvg(dob)) {
            System.out.println("Equals.");
        } else {
            System.out.println("Different.");
        }
        System.out.println("The average value of iob and fob ");
        if (iob.sameAvg(fob)) {
            System.out.println("Are the same.");
        } else {
            System.out.println("Different.");
        }
    }
}
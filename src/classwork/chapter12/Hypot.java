package classwork.chapter12;

public class Hypot {

    public static void main(String[] args) {

        double side, side2;
        double hypot;
        side = 3.0;
        side2 = 4.0;


        hypot = Math.sqrt(Math.pow(side, 2) + Math.pow(side2, 2));

        System.out.println("For a given side length " + side + " and "
                + side2 + " hypotenuse equals " + hypot);
    }
}
package classwork.chapter3;
//Calculate the area of a circle
public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; //circle radius
        pi = 3.1416; //approximate value of pi
        a = pi * r * r; //calculate the area of a circle

        System.out.println("The area of the circle is " + a);
    }
}

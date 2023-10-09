package classwork.chapter8;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In area of the triangle.");
        return dim * dim2 / 2;
    }
}
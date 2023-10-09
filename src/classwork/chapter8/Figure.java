package classwork.chapter8;

abstract class Figure {
    double dim;
    double dim2;

    Figure(double a, double b) {
        dim = a;
        dim2 = b;
    }

    abstract double area();
//       System.out.println("The area of the figure is not determined");
//        return 0;

}
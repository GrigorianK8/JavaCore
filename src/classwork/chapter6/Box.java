package classwork.chapter6;

public class Box {
    double width;
    double height;
    double depth;

//        void volume() {
//        System.out.print("The volume is ");
//        System.out.println(width * height * depth);
//    }
    double volume() {
        return width * height * depth;
    }

//    void setDim(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }

//    Box()
//      System.out.println("Construction of the Box object");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
//    resolving namespace conflicts
//    Box(double width, double haight, double depth) {
//        this.width = width;
//        this.height = haight;
//        this.depth = depth;
//    }
}
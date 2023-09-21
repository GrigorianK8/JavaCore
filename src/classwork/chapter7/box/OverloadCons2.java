package classwork.chapter7.box;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox);

        double vol;

        vol = mybox.volume();
        System.out.println("mybox volume is " + vol);

        vol = mybox2.volume();
        System.out.println("mybox2 volume is " + vol);

        vol = mycube.volume();
        System.out.println("mycube volume is " + vol);

        vol = myclone.volume();
        System.out.println("the clone volume is " + vol);
    }
}
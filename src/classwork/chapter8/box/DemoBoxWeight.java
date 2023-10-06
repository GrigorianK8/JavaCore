package classwork.chapter8.box;

import classwork.chapter8.box.BoxWeight;

public class DemoBoxWeight {

    public static void main(String[] args) {
        BoxWeight myBox = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox.volume();
        System.out.println("The volume of myBox equal to " + vol);
        System.out.println("The weight of myBox equal to " +
                myBox.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("The volume of myBox2 equal to " + vol);
        System.out.println("The weight of myBox2 equal to " +
                myBox2.weight);
        System.out.println();
    }
}
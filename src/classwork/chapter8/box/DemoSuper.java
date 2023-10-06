package classwork.chapter8.box;

import classwork.chapter8.box.BoxWeight;

public class DemoSuper {

    public static void main(String[] args) {
        BoxWeight myBox = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox);
        double vol;

        vol = myBox.volume();
        System.out.println("The volume of myBox to equal " + vol);
        System.out.println("The weight of myBox to equal " + myBox.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("The volume of myBox2 to equal " + vol);
        System.out.println("The weight of myBox2 to equal " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("The volume of myBox3 to equal " + vol);
        System.out.println("The weight of myBox to equal " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("The volume of myClone to equal " + vol);
        System.out.println("The weight of myClone to equal " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("The volume of myCube to equal " + vol);
        System.out.println("The weight of myCube to equal " + myCube.weight);
        System.out.println();
    }
}
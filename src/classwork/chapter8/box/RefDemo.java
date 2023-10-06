package classwork.chapter8.box;

import classwork.chapter8.box.Box;
import classwork.chapter8.box.BoxWeight;

public class RefDemo {

    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("The volume of weightBox equal to " + vol);
        System.out.println("The weight of weightBox equal to " +
                weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("The volume of plainBox equal to " + vol);
        //    Error: plainbox does not define a member weight
        //    System.out.println("The weight of plainBox equal to " + plainBox.weight);
    }
}
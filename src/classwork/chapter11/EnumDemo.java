package classwork.chapter11;

public class EnumDemo {

    public static void main(String[] args) {

        Apple ap;
        ap = Apple.RedDel;

        System.out.println("Significance ap " + ap);
        System.out.println();

        if (ap == Apple.GoldenDel) {
            System.out.println("Variable ap contains GoldenDel");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("The Jonathan variety is red.");
                break;
            case GoldenDel:
                System.out.println("The GoldenDel variety is yellow.");
                break;
            case RedDel:
                System.out.println("The RedDel variety is red.");
            case Winesap:
                System.out.println("The Winesap variety is red.");
            case Cortland:
                System.out.println("The Cortland variety is red.");
                break;
        }
    }
}
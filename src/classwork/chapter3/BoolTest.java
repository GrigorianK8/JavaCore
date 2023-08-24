package classwork.chapter3;
//Demonstrate the use of type values boolean
public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equals " + b);
        b = true;
        System.out.println("b equals " + b);

        //a boolean value can control an if statement
        if(b){
            System.out.println("This code is being executed.");
        }

        b = false;
        if(b){
            System.out.println("This code is not being executed.");
        }

        //comparison result - boolean value
        System.out.println("10 > 9 equals " + (10 > 9));




    }
}

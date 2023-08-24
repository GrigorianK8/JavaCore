package classwork.chapter2;

public class IfSample {
    public static void main(String[] args) {

        int x, y;

        x = 10;
        y = 20;

        if(x < y){
            System.out.println(x + " less then " + y);

            x = x * 2;

            if(x == y){
                System.out.println("x equals y");

                x = x * 2;

                if(x > y){
                    System.out.println("x more then y");

                    if(x == y ){
                        System.out.println("You dont see it");
                    }
                }
            }
        }
    }
}

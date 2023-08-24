package classwork.chapter3;
//Calculate the distance traveled by light,
//using variables of type long

public class LongVariable {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate speed of light, miles per second

        lightspeed = 186000;

        days = 1000; //specify the number of days

        seconds = days * 24 * 60 * 60;
        //convert to seconds
        distance = lightspeed * seconds;
        //calculate distance
        System.out.print("For " + days);
        System.out.print(" Days the light will pass about ");
        System.out.println(distance + " miles.");


    }
}

package classwork.chapter8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateExample {

    static Scanner scanner = new Scanner(System.in);
    static Date date = new Date();

    public static void main(String[] args) throws ParseException {



        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:ss");

//        System.out.println(date);
        System.out.println(sdf.format(date));
        String birthdayStr = scanner.nextLine();
        sdf.parse(birthdayStr);
        System.out.println(date);
    }
}
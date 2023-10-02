package classwork.chapter7;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input full name");
        String fullName = scanner.nextLine();
        String[] fullNameArray = fullName.split(" ");
        System.out.println(fullNameArray[0]);
        System.out.println(fullNameArray[1]);
    }
}
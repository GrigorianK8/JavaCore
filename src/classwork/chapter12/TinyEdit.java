package classwork.chapter12;

import java.io.*;

public class TinyEdit {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to complete.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop"));
            break;
        }

        System.out.println("The contents of your file.");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
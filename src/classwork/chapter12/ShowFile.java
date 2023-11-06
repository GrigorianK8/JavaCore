package classwork.chapter12;

import java.io.*;

public class ShowFile {

    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Utilization: ShowFile file_name");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file.");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("File closing error.");
        }
    }
}
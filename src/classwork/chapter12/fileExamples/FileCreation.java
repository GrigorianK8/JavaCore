package classwork.chapter12.fileExamples;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Grigorian_88\\IdeaProjects\\Java Core\\src\\classwork\\chapter12\\fileExamples";
        File file = new File(filePath);

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created!");
            } catch (IOException e) {
                System.out.println("Created failed: " + e);
            }
        } else {
            System.out.println("File not created!");
        }

//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("File deleted!");
//            }
//        }
    }
}
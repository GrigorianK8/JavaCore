package classwork.chapter12.fileExamples;

import java.io.*;
import java.util.Date;

public class fileExample {

    public static void main(String[] args) {


        String filePath = "C:\\Users\\Grigorian_88\\IdeaProjects\\Java Core\\src\\classwork\\chapter12\\fileExamples\\folder1";

        File file = new File(filePath + File.separator + "folder2");
        if (!file.exists()) {
            System.out.println(file.mkdir());
        }

//       if (file.isDirectory()) {
//           File[] list = file.listFiles();
//           for (File f : list) {
//               if (f.isFile()) {
//                   System.out.println(f.getName() + " " + f.length() + " " + new Date(f.lastModified()) + " " + f.canWrite());
//               }
//           }
//       }

    }
}
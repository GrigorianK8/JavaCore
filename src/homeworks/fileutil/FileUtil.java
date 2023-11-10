package homeworks.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
//        createFileWithContent();
    }

    static void fileSearch() {
        try {
            System.out.print("Input the path of the folder: ");
            String folderPath = scanner.nextLine();
            System.out.print("Input the file name to search for: ");
            String fileName = scanner.nextLine();

            File folder = new File(folderPath);
            if (folder.exists() && folder.isDirectory()) {
                File[] files = folder.listFiles();
                boolean fileFound = false;
                if (files != null) {
                    for (File file : files) {
                        if (file.getName().equals(fileName)) {
                            fileFound = true;
                            break;
                        }
                    }
                }
                System.out.println("File found: " + fileFound);
            } else {
                System.out.println("The folder does not exist or is not a directory!");
            }
        } catch (NullPointerException e) {
            System.out.println("The path is invalid!");
        }
    }

    static void contentSearch() {
        System.out.print("Input the path of the folder: ");
        String folderPath = scanner.nextLine();
        System.out.print("Input the keyword to search for: ");
        String keyword = scanner.nextLine();

        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.getName().toLowerCase().endsWith(".txt") || file.getName().toLowerCase().endsWith(".doc") || file.getName().toLowerCase().endsWith(".pdf")) {
                        System.out.println("Scanning file: " + file.getName());
                        try {
                            BufferedReader br = new BufferedReader(new FileReader(file));
                            String line;
                            while ((line = br.readLine()) != null) {
                                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                                    System.out.println("Keyword found in the file: " + file.getName() + " - " + line);
                                }
                            }
                            br.close();
                        } catch (IOException e) {
                            System.out.println("Error while reading a file: " + file.getName());
                        }
                    }
                }
            } else {
                System.out.println("No files were found in the specified directory!");
            }
        } else {
            System.out.println("The folder does not exist or is not a directory!");
        }
    }

    static void findLines() {
        System.out.print("Input the path of the text file: ");
        String txtPath = scanner.nextLine();
        System.out.print("Input a keyword for your search: ");
        String keyword = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(txtPath))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (Exception e) {
            System.out.println("File read error or file not found!");
        }
    }

    public static void printSizeOfPackage() {
        System.out.print("Input the folder name: ");
        String folderName = scanner.nextLine();

        File folder = new File(folderName);
        double totalSize = calculateFolderSize(folder);

        if (totalSize != -1) {
            System.out.println("Total size of " + folder.getName() + " folder: " + formatSize(totalSize));
        } else {
            System.out.println("The folder does not exist or a sizing error occurred!");
        }
    }

    public static void createFileWithContent() {
        System.out.print("Input the path to the folder: ");
        String folderPath = scanner.nextLine();
        System.out.print("Input the file name: ");
        String fileName = scanner.nextLine();
        System.out.print("Input the contents of the file: ");
        String content = scanner.nextLine();

        try {
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            File file = new File(folder, fileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);

            bufferedWriter.close();

            System.out.println("The file was successfully created at: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static long calculateFolderSize(File folder) {
        long size = 0;
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        size += file.length();
                    } else if (file.isDirectory()) {
                        long subdirectorySize = calculateFolderSize(file);
                        if (subdirectorySize == -1) {
                            return -1;
                        }
                        size += subdirectorySize;
                    }
                }
            }
        } else {
            return -1;
        }
        return size;
    }

    private static String formatSize(double size) {
        if (size < 1024) {
            return size + " B";
        } else if (size < 1024 * 1024) {
            return size / 1024 + " KB";
        } else {
            return size / (1024 * 1024) + " MB";
        }
    }
}
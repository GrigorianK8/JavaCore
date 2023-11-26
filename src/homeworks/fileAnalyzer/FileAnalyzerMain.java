package homeworks.fileAnalyzer;

import java.util.Map;
import java.util.regex.Pattern;

public class FileAnalyzerMain {

    static FileAnalyzer fileAnalyzer = new FileAnalyzer();

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Grigorian_88\\IdeaProjects\\Java Core\\src\\homeworks\\fileAnalyzer\\simpleText.txt";
        int n = 5;

        Map<String, Integer> topWords = fileAnalyzer.topFrequentWords(filePath, n);
        System.out.println("Top " + n + " frequent words:");
        for (Map.Entry<String, Integer> entry : topWords.entrySet()) {
            String word = entry.getKey().replaceAll("[.,]", "");
            System.out.println(word + " - " + entry.getValue());
        }

        System.out.println("-------------");

        int uniqueWordsCount = fileAnalyzer.uniqueWordCount(filePath);
        System.out.println("Number of unique words: " + uniqueWordsCount);

        System.out.println("--------------");

        int totalWords = fileAnalyzer.totalWordCount(filePath);
        System.out.println("Total number of words: " + totalWords);

        System.out.println("--------------");

        String wordToCount = "The";
        int occurrences = fileAnalyzer.countWordOccurrences(filePath, wordToCount);
        System.out.println("Number of occurrences of '" + wordToCount + "': " + occurrences);
    }
}
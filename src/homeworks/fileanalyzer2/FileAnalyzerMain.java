package homeworks.fileanalyzer2;

import java.util.Map;

public class FileAnalyzerMain {

    public static void main(String[] args) {

        String path = "C:\\Users\\Grigorian_88\\IdeaProjects\\Java Core\\src\\homeworks\\fileAnalyzer\\simpleText.txt";

        Map<String, Integer> stringIntegerMap = FileAnalyzer.wordMap(path);

        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }

        System.out.println("Total word count -> " + FileAnalyzer.totalWordCount(path));
        System.out.println("Unique word count  -> " + FileAnalyzer.uniqueWordCount(path));

        Map<String, Integer> stringIntegerMap1 = FileAnalyzer.topFrequentWords(path, 5);
        System.out.println("Top frequent words");
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }

        System.out.println("Count word  occurrences -> " + FileAnalyzer.countWordOccurrences(path, "set"));
    }
}
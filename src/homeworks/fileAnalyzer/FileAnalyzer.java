package homeworks.fileAnalyzer;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {

    public Map<String, Integer> wordMap(String path) throws IOException {
        Map<String, Integer> wordQuantityMap = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                wordQuantityMap.put(word, wordQuantityMap.getOrDefault(word, 0) + 1);
            }
        } catch (IOException e) {
            throw new CustomUncheckedException("Error reading file: " + path, e);
        }
        return wordQuantityMap;
    }

    public int totalWordCount(String path) {
        Map<String, Integer> wordQuantityMap;
        try {
            wordQuantityMap = wordMap(path);
        } catch (IOException e) {
            throw new CustomUncheckedException("Error reading file in totalWordCount for path: " + path, e);
        }
        int totalWords = 0;
        for (int count : wordQuantityMap.values()) {
            totalWords += count;
        }
        return totalWords;
    }

    public int uniqueWordCount(String path) {
        Map<String, Integer> wordQuantityMap;
        try {
            wordQuantityMap = wordMap(path);
        } catch (IOException e) {
            throw new CustomUncheckedException("Error reading file in uniqueWordCount: " + path, e);
        }
        int uniqueWordsCount = 0;
        for (int count : wordQuantityMap.values()) {
            if (count == 1) {
                uniqueWordsCount++;
            }
        }
        return uniqueWordsCount;
    }

    public Map<String, Integer> topFrequentWords(String path, int n) {
        Map<String, Integer> wordQuantityMap;
        try {
            wordQuantityMap = wordMap(path);
        } catch (IOException e) {
            throw new CustomUncheckedException("Error reading file in topFrequentWords: " + path, e);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordQuantityMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        Map<String, Integer> topWordsMap = new LinkedHashMap<>();
        for (int i = 0; i < Math.min(n, entryList.size()); i++) {
            Map.Entry<String, Integer> entry = entryList.get(i);
            topWordsMap.put(entry.getKey(), entry.getValue());
        }
        return topWordsMap;
    }

    public int countWordOccurrences(String path, String word) {
        Map<String, Integer> wordQuantityMap;
        try {
            wordQuantityMap = wordMap(path);
        } catch (IOException e) {
            throw new CustomUncheckedException("Error reading file in countWordOccurrences: " + path, e);
        }
        int occurrences = wordQuantityMap.getOrDefault(word.toLowerCase(), 0);
        return occurrences;
    }
}
package collections.lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Mając do dyspozycji plik tekstowy z angielską wersją książki “Przygody Alicji w Krainie Czarów” alice30.txt wyznacz:
 * liczbę różnych wyrazów użytych w książce (pomiń znaki interpunkcyjne oraz cyfry),
 * literę na jaką zaczyna się najwięcej (różnych) wyrazów.
 */

public class AliceBook {
    private final static String FILE_NAME = "src/collections/lab18/alice30.txt";
    public static void main(String[] args) {
        TreeSet<String> uniqueWordsInBook = getUniqueWordsInBook(FILE_NAME);
        System.out.println("Liczba różnych wyrazów użytych w książce to:" + uniqueWordsInBook.size());

        TreeMap<Character, Integer> letterStats = getLetterStats(uniqueWordsInBook);
        System.out.println(letterStats);

        Map.Entry<Character, Integer> entry = findMaxLetterStats(letterStats);
        System.out.println("Litera na jaką zaczyna się najwięcej (różnych) wyrazów to " + entry.getKey() +
                ", jest ich: " + entry.
                getValue());
    }

    private static TreeSet<String> getUniqueWordsInBook(String fileName) {
        TreeSet<String> uniqueWordsInBook = new TreeSet<>();

        List<String> lines = getBookLines(fileName);
        for (String line : lines) {
            String[] lineWords = line.split(" | --");
            for (String word : lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    uniqueWordsInBook.add(word.toLowerCase());
                }
            }
        }

        return uniqueWordsInBook;
    }

    private static List<String> getBookLines(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku: " + e.getMessage());
        }

        return null;
    }

    private static String cleanWord(String word) {
        return word.replaceAll("[^a-zA-Z]", "");
    }


    private static TreeMap<Character, Integer> getLetterStats(TreeSet<String> uniqueWordsInBook) {
        TreeMap<Character, Integer> letterStats = new TreeMap<>();

        uniqueWordsInBook.forEach(word -> letterStats.put(
                word.charAt(0), letterStats.getOrDefault(word.charAt(0), 0) + 1)
        );

        return letterStats;
    }

    private static Map.Entry<Character, Integer> findMaxLetterStats(TreeMap<Character, Integer> letterStats) {
        Map.Entry<Character, Integer> entry = null;

        for (Map.Entry<Character, Integer> letterStat : letterStats.entrySet()) {
            if (entry == null || letterStat.getValue() > entry.getValue()) {
                entry = letterStat;
            }
        }

        return entry;
    }
}

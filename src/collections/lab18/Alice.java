//package collections.lab18;
///*Mając do dyspozycji plik tekstowy z angielską wersją książki “Przygody Alicji w Krainie Czarów” alice30.txt wyznacz:
//
//liczbę różnych wyrazów użytych w książce (pomiń znaki interpunkcyjne oraz cyfry),
//literę na jaką zaczyna się najwięcej (różnych) wyrazów.
//
// */
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Alice {
//    private static final String FILE_PATH = "C:\\Users\\ewa48\\IdeaProjects\\jwd\\src\\collections\\lab18\\alice30.txt";
//    public static void main(String[] args) {
//        List<String> allLines = loadTextFile(FILE_PATH);
//        if (allLines != null) {
//            Set<String> words = didvideIntoWordsAndClean(allLines);
//            System.out.println("Liczba różnych wyrazów w książce: " + words.size() + ".");
//
//            Map<Character, Integer> firstLetterStats = createFirstLetterStats(words);
//            System.out.println(firstLetterStats);
//
//            Map.Entry<Character, Integer> entry = findFirstLetterCommonWord(firstLetterStats);
//            System.out.println("Litera na jaka zaczyna się najwięcej wyrazów to \"" + entry.getKey() + "\", jest ich" + entry.getValue() + );
//
//
//        }
//
//    }
//
//    private static List<String> loadTextFile(String filePath) {
//        try {
//            return Files.readAllLines(Paths.get(filePath));
//        } catch (IOException e) {
//            System.out.println("Coś poszło nie tak przy wczytywaniu pliku: " + e.getMessage());
//        }
//        return null;
//    }
//
//    private static Set<String> didvideIntoWordsAndClean(List<String> allLines) {
//        Set<String> words = new TreeSet<>(){
//        for (String line : allLines);
//            String[] lineWords = line.split(" | --");
//            if (!word.isEmpty()) {
//                words.add(word.toLowerCase());
//            }
//        }
//    }
//        return words;
//}
//    private  static String cleanWord(String word) {
//        return word.replaceAll("\\p{Punct}|\\d", "" );
//    }
//
//
//    private static Map<Character, Integer> createfirstLetterStats = createFirstLetterStats(Set<String> words)
//
//    {
//        Map<Character, Integer> firstLetterStats = TreeMap <>();
//        for (String word : words) {
//            Character firstLetter = word.charAt(0);
//            firstLetterStats.put(firstLetter, firstLetterStats.getOrDefault(firstLetter, 0) + 1);
//        }
//        return firstLetterStats;
//    }
//
//    private static Map.Entry<Character, Integer> findFirstLetterCommonWord(Map<Character, Integer> createfirstLetterStats) {
//        Map.Entry<Character, Integer> mostCommonFirstLetterEntry = null;
//        for (Map.Entry<Character, Integer> entry : createfirstLetterStats.entrySet()) {
//            if(mostCommonFirstLetterEntry == null || entry.getValue() > mostCommonFirstLetterEntry.getValue()) {
//                mostCommonFirstLetterEntry = entry;
//
//            }
//        }
//        return  mostCommonFirstLetterEntry;
//
//        }
//    }
//

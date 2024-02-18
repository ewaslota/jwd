package collections.lab18;
/*
Mając do dyspozycji plik z książką w formacie tekstowym crsto10.txt wykonaj poniższe polecenia:
wczytaj do listy wszystkie wiersze książki “Hrabia Monte Christo”,
wyznacz liczbę wszystkich wierszy, tworząc metodę, która przyjmuje obiekty typu List i zwraca liczbę typu int (liczba elementów listy),
napisz metodę, która wyświetli na ekranie co setny wiersz książki,
napisz metodę, która znajdzie i wyświetli najdłuższy wers z książki wielkimi literami.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Book {
    public static void main(String[] args) {
        Book book = new Book();
        //book.loadTestFile("src/plikiróżne/crsto10 (1).txt");
        List<String> allLines = book.loadTestFile("src/plikiróżne/crsto10 (1).txt");

        if (allLines != null && !allLines.isEmpty()) {
            System.out.println("Wczytany plik zaiera: " + book.countLines(allLines) + " linii.");
            book.showEveryHundredLine(allLines);
            book.showTheLongestVers(allLines);

        }
    }

    List<String> loadTestFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get("src/plikiróżne/crsto10 (1).txt"));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak: " + e.getMessage());
            e.printStackTrace();
        }
        return null;

    }

    int countLines(List list) {
        return  list.size();
    }

    void showEveryHundredLine(List list) {
        System.out.println();
        for (int i = 1; i < list.size(); i++) {
            if (i % 100 == 0 ) {
                System.out.println(i + " " + list.get(i - 1));
            }

        }
    }

    void showTheLongestVers(List<String> list) {
        String longestLine = "";
        for (String line : list ) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }

        }
        System.out.println("\n Najdłuższy wers książki zawiera " + longestLine.length() + " znaki/ków - " + longestLine.toUpperCase());
    }
}

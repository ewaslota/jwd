package comparing;

/**
 * Napisz program porównujący książki, w tym celu:
 * stwórz klasę Book, posiadającą pola title, author, publisher, year
 * stwórz klasę, Library przechowującą tablicę obiektów Book
 * wprowadź do tablicy kilka egzemplarzy Book
 * zademonstruj porównywanie książek
 * wyświetl szczegóły porównywanych książek
 */
public class Library {
    public static void main(String[] args) {
        Book[] book = {
                new Book("Pan Tadeusz", "Adam Mickiewicz", "Siedmioróg", +2022),
                new Book("Pan Tadeusz", "Adam Mickiewicz", "Siedmioróg", +2022),
                new Book("O krasnoludkach i sierotce Marysi", "Maria Konopnicka", "G&P", +2023),
        };
        Book book1 = book[0];
        Book book2 = book[1];

        System.out.println("Książka 1: " + book1);
        System.out.println("Książka 2: " + book2);

       // "To dwie identyczne książki" "To dwie różne książki"

        if (book1.equals(book2)) {
            System.out.println("To dwie identyczne książki");
        } else {
            System.out.println("To dwie różne książki");
        }
    }
}

package comparing;

import java.util.Objects;

/**
 * Napisz program porównujący książki, w tym celu:
 * stwórz klasę Book, posiadającą pola title, author, publisher, year
 * stwórz klasę, Library przechowującą tablicę obiektów Book
 * wprowadź do tablicy kilka egzemplarzy Book
 * zademonstruj porównywanie książek
 * wyświetl szczegóły porównywanych książek
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    int year;

    public Book(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}

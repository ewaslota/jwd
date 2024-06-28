package homeworks.homework4.point2;

import java.util.Scanner;

/**
 * Napisz program, który prosi użytkownika o podanie indeksu tablicy
 * a następnie wyświetla wartość znajdującą się pod tym indeksem.
 * Obsłuż przypadek, gdy indeks jest poza zakresem tablicy, wyświetlając komunikat “Indeks poza zakresem!”
 *  oraz przypadek, gdy wprowadzone dane nie są liczbą całkowitą, wyświetlając komunikat “Wprowadź poprawny indeks!”.
 */
public class View {

    public static void main(String[] args) {
        // definiuję tablicę
        String[] capital = {"Warsaw", "London", "Berlin"};
        // Napisz program, który prosi użytkownika o podanie indeksu tablicy
        System.out.println("Wprowadź indeks tablicy capital:");

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();



        try {
            int index = Integer.parseInt(number);
            String value = capital[index];
            // a następnie wyświetla wartość znajdującą się pod tym indeksem.
            String nazwa = capital[index];
            System.out.println("Indeks tablicy capital o numerze: " + index + " to: " + nazwa);
        } catch (ArrayIndexOutOfBoundsException e) { // Obsłuż przypadek, gdy indeks jest poza zakresem tablicy, wyświetlając komunikat “Indeks poza zakresem!”
            System.out.println("Indeks poza zakresem!");
        }catch (NumberFormatException ecception) { // oraz przypadek, gdy wprowadzone dane nie są liczbą całkowitą, wyświetlając komunikat “Wprowadź poprawny indeks!”.
            System.out.println("Wprowadź poprawny indeks!");
        }
    }
}

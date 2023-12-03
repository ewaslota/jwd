package nightworking.loops;

import java.util.Scanner;

/**
 * Napisz program, który:
 * konwertuje binarną liczbę całkowitą na postać dziesiętną,
 * dane wejściowe są wprowadzane jako ciąg znaków,
 * wynik powinien być zmienną typu long,
 * nie korzystaj z gotowych rozwiązań.
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary;
        // Wyświetl napis: podaj liczbę binarną:
        System.out.println("Podaj liczbę binarną: ");
        // Zczytaj liczbę podaną przez użytkownika
        Scanner scanner = new Scanner(System.in);
        // Podstaw zczytaną liczbę do zmiennej binary
        binary = scanner.nextLine();

        int weight = binary.length() - 1;
        long sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            //cyfra 0 lub 1 na pozycji i liczby binary
            int digit = switch (binary.charAt(i)) {
                case '0' -> 0;
                case '1' -> 1;
               default -> throw new IllegalStateException("Unexpected value: " + binary.charAt(i));
            };

            // powerResult = 2 ^ weight
            int powerResult = (int) Math.pow(2, weight);

            //multipliationResult = cyfra * wynik z potęgi
            int multiplicationResult = digit * powerResult;

            // dodawanie multiplicationResult z bieżącego i do sumy
            sum += multiplicationResult;

            //na kolejnej pozycji liczby binarnej zmniejszamy wykładnik potęgi (wagę cyfry) o 1
            weight--;
        }
        System.out.println("Wynik konwersji liczby binarnej: " + binary + " to liczba decymalna: " + sum);
    }
}

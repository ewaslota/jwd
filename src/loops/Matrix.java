package loops;

import java.util.Scanner;

/**
 * Napisz program, który dla dowolnej liczby całkowitej n z przedziału (1 ≤ n ≤ 30) wypisuje macierz jak w poniższych przykładach.
 * Użyj dwóch zagnieżdżonych pętli.
 *
 * n = 2	matrix
 * --------------
 *   1  2
 *   2  3
 *
 * n = 3	matrix
 * --------------
 *   1  2  3
 *   2  3  4
 *   3  4  5
 *
 * n = 4	matrix
 * --------------
 *   1  2  3  4
 *   2  3  4  5
 *   3  4  5  6
 *   4  5  6  7
 *
 */
public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert matrix size: ");
        int n = scanner.nextInt();

        System.out.println();

        if (n < 1 || n > 30) {
            System.out.println("Matrix size should be between 1 and 30!");
            return;
        }

        int value;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                value = i + 1 + j;
                System.out.print(value);
                System.out.print(value < 10 ? "  " : " ");
            }
            System.out.print("\n");
        }
    }
}

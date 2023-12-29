package homeworks.homework2.point2;

import java.util.Random;

/**
 * Napisz program wyświetlający świąteczną choinkę składającą się z losowych elementów
 * następującego zbioru znaków ASCII: '+’, '.’, '*’, '~’, '^’, 'o’.
 * Wysokość choinki powinna być podawana jako argument programu. Jeżeli wysokość nie
 * zostanie określona to powinna zostać przyjęta domyślna wartość 18.
 * Przykład:
 * <p>
 * _ChristmasTree
 */
public class ChristmasTree {
    public static void main(String[] args) {
        Random random = new Random();
        int length = args.length >= 1 ? Integer.parseInt(args[0]): 18;

        char blankSpace = ' ';
        char[] chars = {'+', '.', '*', '~', '^', 'o'};

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                System.out.print(blankSpace);
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                int x = random.nextInt(6);
                System.out.print(chars[x]);
            }
            System.out.println();
        }
    }
}
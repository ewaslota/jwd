// przykład losowania liczby ze zbioru 0, 1, 2

package modifiers;

import java.util.Random;

public class RandomTester {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            System.out.println(random.nextInt(3));
        }
    }
}

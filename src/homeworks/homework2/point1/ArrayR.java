package homeworks.homework2.point1;

/**
 * Napisz program, który:
 * stworzy tablicę liczb typu int o rozmiarze,
 * który będziemy podawać jako argument przy starcie programu,
 * wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
 * wyświetli zawartość tablicy,
 * dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie
 * (ciąg malejący: n, n-1, n-2… 1),
 * wyświetli zawartyość przekonwertowanej tablicy,
 * fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako
 * oddzielne metody.
 */
public class ArrayR {
    public static void main(String[] args) {
        int[] array = initializeArray(Integer.parseInt(args[0]));
        fillArray(array);
        showArray(array);
        revertArray(array);
        showArray(array);
    }

    private static void revertArray(int[] array) {
        int revertedIndex = array.length - 1;
        int[] revertedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            revertedArray[i] = array[revertedIndex];
            revertedIndex--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = revertedArray[i];
        }
    }

    private static void showArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    private static int[] initializeArray(int size) {
        return new int[size];
    }
}

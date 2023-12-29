package homeworks.homework2.point1;

/**
 * /**
 * * Napisz program, który:
 * * stworzy tablicę liczb typu int o rozmiarze,
 * * który będziemy podawać jako argument przy starcie programu,
 * * wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
 * * wyświetli zawartość tablicy,
 * * dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie
 * * (ciąg malejący: n, n-1, n-2… 1),
 * * wyświetli zawartyość przekonwertowanej tablicy,
 * * fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako
 * * oddzielne metody.
 */
public class Array {
    public static void main(String[] args) {
        int n = parseArgs(args);
        int[] array = createArray(n);
        fillArray(array);
        showArray(array);
        reverseArray(array);
        showArray(array);
    }

    private static int parseArgs(String[] args) {
        if (args.length == 0) {
            throw new RuntimeException("No parameter!");
        }
        return Integer.parseInt(args[0]);
    }

    public static int[] createArray(int n) {
        return new int[n];
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public static void showArray(int[] array) {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 < array.length) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }
    }

    public static void reverseArray(int[] array) {
        int index = 0;
        int reverseIndex = array.length - 1;
        int value;
        while (index < reverseIndex) {
            value = array[index];
            array[index] = array[reverseIndex];
            array[reverseIndex] = value;
            index++;
            reverseIndex--;
        }
    }
}
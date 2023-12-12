package homeworks.homework2.point1;

/**
 * /**
 *  * Napisz program, który:
 *  * stworzy tablicę liczb typu int o rozmiarze,
 *  * który będziemy podawać jako argument przy starcie programu,
 *  * wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
 *  * wyświetli zawartość tablicy,
 *  * dokona konwersji tablicy tak, aby elementy ułożyły się odwrotnie
 *  * (ciąg malejący: n, n-1, n-2… 1),
 *  * wyświetli zawartyość przekonwertowanej tablicy,
 *  * fragmenty programu odpowiadjące za konkretne zadania zostaną wyodrębnione jako
 *  * oddzielne metody.
 */
public class Array {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] array = Array.initializeArray(n);
        fillArray(array);
        showArray(array);
        convertArray(array);
        showArray(array);
    }

    private static void convertArray(int[] array) {
        int[] convertedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            convertedArray[i] = array[array.length - i -1];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = convertedArray[i];
        }
    }

    private static void showArray(int[] array) {
        //1, 2,3,4
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
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
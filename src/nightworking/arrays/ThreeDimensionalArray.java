package nightworking.arrays;

/**
 * Zdefiniuj dowolną trójwymiarową tablicę elementów dowolnego typu i wyświetl jej zawartość w sposób przedstawiony poniżej.
 * arr[0][0][0] = 1
 * arr[0][0][1] = 2
 * arr[0][0][2] = 3
 * arr[0][1][0] = 5
 * arr[1][0][0] = 1
 * arr[2][0][0] = 6
 * arr[2][1][0] = 7
 */
public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int [][][] array = {
                {
                        {1},
                        {2},
                        {3},
                },
                {
                        {2,5,6},
                        {3,5,6},
                        {4,5,6},
                },
                {
                        {1,8,7},
                        {2,8,9},
                }
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("arr[" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
                }
            }
        }
    }
}

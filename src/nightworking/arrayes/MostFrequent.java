package nightworking.arrayes;

/**
 * Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.
 * Przykłady:
 *
 * wejście	                                rezultat
 * 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3	4 (5 razy)
 */
public class MostFrequent {
    public static void main(String[] args) {
        int[] input = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        int[] counter = new int[10];
        for (int digit : input) {
            counter[digit]++;
        }
        int maxOccurrences = 0;
        int mostFreguentDigit = 0;
        for (int digit = 0; digit < counter.length; digit++) {
            if (counter[digit] > maxOccurrences) {
                maxOccurrences = counter[digit];
                mostFreguentDigit = digit;
            }
        }
        System.out.println("Najczęściej występująca cyfra to " + mostFreguentDigit + " wystąpiła " + maxOccurrences + " razy.");
    }
}

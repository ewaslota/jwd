package collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(120);
        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        Integer[] array = numbers.toArray(new Integer[numbers.size()]);

        for (Integer number : array) {
            System.out.println(number);
        }
    }
}
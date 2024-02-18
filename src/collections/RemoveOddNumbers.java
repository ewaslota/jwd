package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(27);

        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 != 0) {
                iterator.remove();
            }
        }
    }
}

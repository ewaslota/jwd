package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//zadanie
//utwórz listę 100 elementów (liczba całkowita) od 1 do 100
//wyświetl listę
//usuń co 3 element
//wyświetl listę
public class List100 {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>(120);
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

//        Iterator <Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//           Integer number = iterator.next();
//           if (number % 3 == 0) {
//               iterator.remove();
//           }
//        }

        numbers.removeIf(number -> number % 3 ==0);// lambdy
        System.out.println(numbers);
    }
}

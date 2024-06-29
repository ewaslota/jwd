package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoZjazd5cz2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("aaa");
        words.add("bbb");
        words.add("bbb");
        words.add("ccc");

        System.out.println(Collections.frequency(words, "bbb"));

        System.out.println(words);
        Collections.shuffle(words);
        System.out.println(words);
    }
}

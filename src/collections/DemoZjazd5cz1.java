package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoZjazd5cz1 {
    public static void main(String[] args) {
        Map<String,String> phones = new HashMap<>();
        phones.put("Tomek", "567-234-367");
        phones.put("Alicja", "234-765-987");
        phones.put("Tomek", "999-9999-999");
        phones.put("Barbara", "999-9999-999");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Barbara"));

        System.out.println(phones.get("Barbara"));
        System.out.println(phones.get("Karol"));

        for (String key : phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }

        System.out.println();

        for (String value : phones.values()) {
            System.out.println(value);
        }

        System.out.println();

        for (Map.Entry entry : phones.entrySet()) {

            System.out.println(entry.getKey() +" -> " + entry.getValue());
//            entry.setValue("0");
        }

        System.out.println(phones);
    }
}

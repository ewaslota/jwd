package objects;

import java.util.StringTokenizer;

public class DateTokenizer {
    public static void main(String[] args) {
        StringTokenizer st;

        String quote = "29/04/2016";
        st = new StringTokenizer(quote, "/");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());

        String dataTokenizer = "29/04/2016";
        String day = dataTokenizer.substring(0, 2);
        String month = dataTokenizer.substring(3, 5);
        String year = dataTokenizer.substring(6, 10);

        System.out.println("Data: " + dataTokenizer);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);
    }
}

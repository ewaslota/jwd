package nightworking.objects;

import java.util.StringTokenizer;

/**
 * Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016) na trzy oddzielne teksty.
 */
public class BirthdateTokenizer {
    public static void main(String[] args) {
        String birthdate = "29/04/2016";

        StringTokenizer stringTokenizer = new StringTokenizer(birthdate, "/");

        System.out.println(stringTokenizer.nextToken());
        System.out.println(stringTokenizer.nextToken());
        System.out.println(stringTokenizer.nextToken());
        System.out.println();

        System.out.println(birthdate.substring(0, 2));
        System.out.println(birthdate.substring(3, 5));
        System.out.println(birthdate.substring(6, 10));
    }
}

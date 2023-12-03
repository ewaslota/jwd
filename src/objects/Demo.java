package objects;

import java.awt.*;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        Object object = new Object();
        String name = new String("Ala");
        Point point = new Point(0, 0);

        System.out.println(Math.max(23423, 23));

        String s1, s2;
        s1 = String.valueOf(550);
        s2 = s1.valueOf(550);// zapis mylący bo to metoda narzędziowa statyczna

        System.out.println(s1);
        System.out.println(s2);

        //metoda printf

        int accountBalance = 15005;

        System.out.println(accountBalance);
        System.out.printf("Saldo: %,d zł%n", accountBalance);
        System.out.printf(new Locale("us"),"Saldo: %,d zł%n", accountBalance); // dodajemy us - symbol kraju, aby wskazać na kraj, np. polska - pl

        // po % przydatne są również :
        // s - strings
        // d - decimals integers
        // f - floating points
        // t - date/time values
        // n - new line
        // bB - boolean format

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.11f%n", pi);
        System.out.printf(new Locale("us"),"%.20f%n", pi);
        System.out.println("--------");

        //konwersja i rzutowanie
        byte a = 7;
        short b;
        int c;

        c = a;// konwersja niejawna
        b = (short)c; // konwersja jawna tj. rzuwoanie.

        int aa = 5;
        double bb = 13.5;

        double cc = bb/aa; // konwersja niejawna
        double ccc = bb/(double)aa; // konwersja jawna tj. rzutowanie

        int cccc = (int)bb/aa; // rzutowanie

        // boxing - automatyczne pakowanie, unboxing - automatyczne rozpakowywanie

        Float f1 = 12.5F;
        Float f2 = 27.2F;

        System.out.println("Mniejsza z liczb: " + Math.min(f1, f2));

        String sstr1 = "Jakiś napis.";

        System.out.println(sstr1.getClass().getSimpleName());

        boolean check1 = "Teksas" instanceof String;
        System.out.println(check1);

        boolean check2 = "Teksas" instanceof String;
        Object object1 = new Object();

        boolean check3 = object instanceof String;
        System.out.println(check3);

        boolean check4 = "Ala ma kota." instanceof Object;
        System.out.println(check4);

    }
}

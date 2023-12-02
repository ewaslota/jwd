package nightworking.loops;

public class ExcercisesLoops {
    public static void main(String[] args) {
        //pętla for
        for (int i = 3; i < 7; i++) {
            System.out.println("i= " + i);
        }

        // pętla while
        int j = 8;
        while (j <= 10) {
            System.out.println("j = " + j);
            j++;
        }

        // pętla do while
        int k = 9;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 10);

        //pętla for
        int dzień;
        for (dzień = 5; dzień <= 7; dzień++) {
            System.out.println("Zostało " + (7 - dzień) + " dni do końca tygodnia");
        }

        // pętla while
        int czasPracy = 6;
        while (czasPracy <= 8) {
            System.out.println("Jeśli przepracujesz " + czasPracy + " godzin, to zarobisz " + czasPracy * 22 + " zł.");
            czasPracy++;

        }

        // pętla do while
        int b = 8;

        do {
            System.out.println("b " + b);
            b++;
        } while (b < 5);

        //pętla for
//        W tej pętli mamy mieś:
//
//        dwie instrukcje inicjalizujące, rozdzielone przecinkami – utworzenie dwóch zmiennych: x oraz y,
//                dwie instrukcje kroku – pomnożenie wartości zmiennej x razy 2 oraz zmiennej y razy 3.
        // następnie dodałam do siebie wyniki

        for (int x = 1, y = 1; x < 100 && y < 100; x = x * 2, y = y * 3) {
            System.out.println("x = " + x + ", y = " + y + " razem x + y = " + (x +y));
        }

// break

        for(int i = 5; i < 30; i++) {
            System.out.print(i);
            if(i >= 13) {
                break;
            }
            System.out.println(",");
        }
        System.out.println();

// continue, wypisać liczby parzyste, do 16

        for(int i = 0; i < 17; i++) {
            if(i % 2 == 1) {
                continue;
            }
            if(i == 0) {
                continue;
            }
            System.out.println(i);
        }
        /**
         * Napisz program z użyciem pętli while, który wypisuje
         * wszystkie liczby od 1 do 10 (włącznie), oddzielone przecinkami, poza liczbą 10,
         * po której nie powinno być przecinka.
         */
//        int od1do10 = 1;
//        while(od1do10 >= 1 && od1do10 <= 10) {
//            System.out.println(od1do10 + for(od1do10 < 10));
//            od1do10++;
//
//        }
        /**
         * While i liczby od 1 do 10¶
         * Napisz program z użyciem pętli while, który wypisuje wszystkie liczby od 1 do 10 (włącznie), oddzielone przecinkami, poza liczbą 10, po której nie powinno być przecinka.
         *
         * Policz silnię¶
         * Napisz program, który policzy i wypisze silnię liczby, którą poda użytkownik. Silnia to iloczyn kolejnych liczb całkowitych od 1 do danej liczby, np. silnia 5 to 1 * 2 * 3 * 4 * 5, czyli 120. Silnia liczby 0 to 1.
         *
         * Palindrom¶
         * Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest palindromem. Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. kajak.
         *
         * Wypisz największą liczbę z podanych¶
         * Napisz program, który z liczb podanych przez użytkownika wypisze największą. Program po pobraniu każdej liczby powinien pytać, czy użytkownik chce podać kolejną liczbę. Po podaniu liczb, program powinien wypisać największą z nich.
         *
         * Zagnieżdżone pętle¶
         * Napisz program z dwoma pętlami (jedna zagnieżdżona w drugiej), każda z pętli powinna iterować od 1 do 10.
         *
         * Pętla główna powinna pomijać swoje iteracje za pomocą instrukcji continue, gdy jej zmienna jest nieparzysta.
         * Pętla zagnieżdżona powinna wypisywać wartość swojej zmiennej. Następnie, gdy zmienna pętli zagnieżdżonej jest większa od zmiennej pętli głównej, pętla zagnieżdżona powinna spowodować, że przejdziemy do kolejnej iteracji pętli głównej (w tym przypadku skorzystaj z etykiety i instrukcji continue).
         * Kalkulator¶
         * Napisz program, który będzie pobierał od użytkownika liczby i działania do wykonania na nich. Program powinien wypisywać wynik po każdym działaniu. Możliwe działania to:
         *
         * *     mnożenie,
         * /     dzielenie,
         * -     odejmowanie,
         * +     dodawanie.
         * Jeżeli podane zostanie inne działanie, lub podana zostanie liczba 0 jako dzielnik podczas dzielenia, program powinien wypisać stosowny komunikat i ponownie pobrać od użytkownika dane.
         *
         * Na początku, program powinien pobrać od użytkownika dwie liczby i działanie do wykonania na nich. Za każdy kolejnym razem, program powinien pobierać od użytkownika już tylko jedną liczbę i działanie, po czym powinien wykonać podane działanie na poprzednim wyniku i podanej liczbie.
         *
         * Dla przykładu:
         *
         * Program pobiera najpierw dwie liczby od użytkownika: 10 i 15, oraz działanie: dodawanie.
         * Program dodaje do siebie liczby i wypisuje wynik 25 na ekran.
         * Program pyta, czy użytkownik chce wykonać kolejne działanie.
         * Jeżeli nie, program kończy działanie.
         * Jeżeli tak, to program pobiera jedną liczbę i działanie, np. 2 i mnożenie. Program mnoży poprzedni wynik działania – czyli 25 * 2 i wypisuje wynik 50 na ekran. Wracamy do punktu 3. i ponownie pytamy o chęć dalszych kalkulacji.
         * Choinka¶
         * Napisz program, który pobierze od użytkownika jedną liczbę całkowitą. Następnie, program powinien wypisać na ekran choinkę ze znaków *, gdzie w ostatniej linii będzie liczba gwiazdek podana przez użytkownika, a w każdej powyższej o dwie gwiazdki mniej, niż w poniższej.
         *
         * Przykład pierwszy – użytkownik podał liczbę 5, efekt wyświetlony na ekranie:
         *
         *   *
         *  ***
         * *****
         * Przykład drugi – użytkownik podał liczbę 6, efekt na ekranie:
         *
         *   **
         *  ****
         * ******
         */

    }
}

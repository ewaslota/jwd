package nightworking.loops;

import java.util.Scanner;

/**
 *  program próbuje policzyć pole koła o promieniu podanym przez użytkownika –
 *  jeżeli jednak podana przez użytkownika liczba będzie nieprawidłową wartością promienia koła
 *  (będzie mniejsza bądź równa 0), program ponownie spróbuje pobrać liczbę – i tak do skutku:
 */
public class ObliczPoleKoła {
    public static void main(String[] args) {

        int promieńKoła;


        do {
            System.out.println("Podaj promień koła:");
            promieńKoła = getInt();

            if (promieńKoła <= 0) {
                System.out.println("Nieprawidłowy promień. Podaj liczbę większą od 0.");
                continue;
            }

            double poleKoła = 3.14 * promieńKoła * promieńKoła;
            System.out.println("Pole koła to: " + poleKoła + " m2.");
        } while(promieńKoła <= 0);
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

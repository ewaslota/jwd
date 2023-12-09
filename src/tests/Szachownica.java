package tests;

/**
 * Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy, na drugie 2 ziarna,
 * na trzecie 4 ziarna i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
 * Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren na szachownicy.
 */
public class Szachownica {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 15; i++) {
            double wynikPotegowania = Math.pow(2, i);
            sum += wynikPotegowania;
            System.out.println(sum);
        }
    }
}

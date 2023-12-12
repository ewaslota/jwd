package homeworks.homework2.point3;

/**
 *Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy, na drugie 2 ziarna,
 *  na trzecie 4 ziarna i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
 * Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren
 * na szachownicy.
 */
public class Chessboard {

    public static void main(String[] args) {
        long sum = 0;
        for (long i = 0; i <= 64; i++) {
           double powerResult = Math.pow(2, i);
           sum += (long)powerResult;
        }
        System.out.println("There are " + sum + " grains on the chessboard");
    }
}

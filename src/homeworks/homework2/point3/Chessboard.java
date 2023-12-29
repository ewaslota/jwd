package homeworks.homework2.point3;

import java.math.BigInteger;

/**
 *Załóżmy, że na pierwsze pole szachownicy kładziemy 1 ziarno pszenicy, na drugie 2 ziarna,
 *  na trzecie 4 ziarna i na każde następne pole dwa razy więcej ziaren niż na pole poprzednie.
 * Napisz program, który zasymuluje taką sytuację i zliczy sumę wszystkich ziaren
 * na szachownicy.
 */
public class Chessboard {
    public static void main(String[] args) {
        int squaresBoard = 64;
        BigInteger sum = BigInteger.ZERO;
        BigInteger grain = BigInteger.ONE;

        for (int i = 0; i < squaresBoard; i++) {
            sum = sum.add(grain);
            grain = grain.multiply(BigInteger.valueOf(2));
        }
        System.out.println("The sum of all the seeds on the chessboard is: " + sum + ".");
    }
}

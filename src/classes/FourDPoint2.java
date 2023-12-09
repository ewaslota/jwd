package classes;

import java.awt.*;

public class FourDPoint2 extends Point {
    int z;
    int t;

    public static void main(String[] args) {
        FourDPoint2 fourDPoint2 = FourDPoint2.creata(1, 2, 3, 4);
        fourDPoint2.show();
    }

    static FourDPoint2 creata(int x, int y, int z, int t){
        FourDPoint2 fourDPoint2 = new FourDPoint2();
        fourDPoint2.x = x;
        fourDPoint2.y = y;
        fourDPoint2.z = z;
        fourDPoint2.t = t;
        return fourDPoint2;
    }

    void show() {
        System.out.println("x wynosi " + this.x);// this poprawia w tym miejscu czytelność ale nie jest konieczna
        System.out.println("y wynosi " + this.y);
        System.out.println("z wynosi " + this.z);
        System.out.println("t wynosi " + this.t);

    }
}

package nightworking.loops;
import java.util.Scanner;

import static java.lang.reflect.Array.getInt;

public class WypiszGwiazdki {
    public static void main(String[] args) {
        System.out.println("Ile gwiazdek wypisać?");
        int liczbaGwiazdek = getInt();

        for(int i = 0
            ; i < liczbaGwiazdek; i++) {
            System.out.print("*");
        }
//        if(liczbaGwiazdek > 0)
//             do {
//                 System.out.print("*");
//                 liczbaGwiazdek--;
//        } while (liczbaGwiazdek > 0);
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

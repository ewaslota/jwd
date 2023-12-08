package classes;

/**
 * Napisz program, który oblicza pierwiastek kwadratowy z liczby podanej jako argument programu.
 * Uruchom program z wiersza poleceń.
 * Przykład
 * <p>
 * java SquareRootApp 16
 * 4.0
 */
public class SquareRootApp {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(Integer.parseInt(args[0])));
    }
}

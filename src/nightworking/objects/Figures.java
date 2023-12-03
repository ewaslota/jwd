package nightworking.objects;

/**
 * zmienn
 */
public class Figures {
    public static double pi = 3.14; // zmienna klasowa

    public static int calculate() {
        Figures.pi = 5;
        int a = 5;
        int b = 9;
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Wynik dodawania a i b to : " + Figures.calculate());
        System.out.println("Wartość liczby pi to: " + Figures.pi);
    }
}

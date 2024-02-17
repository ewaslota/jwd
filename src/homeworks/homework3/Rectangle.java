package homeworks.homework3;
/*
Utwórz klasę o nazwie Rectangle posiadającą dwie właściwości (długość i szerokość) oraz metodę określającą
pole powierzchni. Klasa powinna posiadać trzy konstruktory:
bez parametrowy - wartościom zarówno długości, jak i szerokości przypisuje się zero,
z dwoma parametrami - dwie liczby są przypisane odpowiednio jako długość i szerokość,
z jednym parametrem - zarówno długość, jak i szerokość otrzymują tą samą wartość.
Utwórz obiekty klasy Rectangle, korzystając ze wszystkich utworzonych konstruktorów i wyświetl ich pola powierzchni.
 */
public class Rectangle {
    int length;
    int width;
    public static int surface(int length, int width) {
        return length * width;
    }

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.length = a;
        this.width = b;
    }

    public Rectangle(int a) {
        this.length = a;
        this.width = a;
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Pierwszy trójkąt:");
        System.out.println("pole powierzchni: " + surface(rectangle1.length, rectangle1.width) + ".");
        System.out.println();

        Rectangle rectangle2 = new Rectangle(5, 6);
        System.out.println("Drugi trójkąt:");
        System.out.println("pole powierzchni: " + rectangle2.surface(rectangle2.length, rectangle2.width) + ".");
        System.out.println();

        Rectangle rectangle3 = new Rectangle(10);
        System.out.println("Trzeci trójkąt:");
        System.out.println("pole powierzchni: " + surface(rectangle3.length, rectangle3.width) + ".");
    }
}

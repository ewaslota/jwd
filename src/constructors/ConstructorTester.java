package constructors;

/**
 * klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
 * instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
 * instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
 * instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)
 */
public class ConstructorTester {
    public static void main(String[] args) {
        new Aa();
        new Bb();
        new Cc();
    }
}


    class Aa {
        public Aa(boolean param) {
            super();
            System.out.println("Działa konstruktor Aa");
        }
    }

    class Bb extends Aa {
        public Bb(boolean param) {
            super(param);
            System.out.println("Działa konstruktor Bb" + param);
        }
    }

    class Cc extends Bb {
        public Cc(boolean param) {
            super(param);
            System.out.println("Działa konstruktor Cc" + param);
        }
    }


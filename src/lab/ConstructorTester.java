package lab;

/**
 * klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
 * instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
 * instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
 * instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)
 */
public class ConstructorTester {
    public static void main(String[] args) {
        System.out.println("Start");
        new A();
        new B();
        new C();

        new A(true);
        new B(true);
        new C(true);

        new A(false);
        new B(false);
        new C(false);
    }
}

class A {
    public A() {
        System.out.println("Działa konstruktor A");
    }

    public A(boolean silent) {
        if (!silent) {
            System.out.println("Działa konstruktor A(" + silent + ")");
        }
    }
}

class B extends A {
    public B() {
        System.out.println("Działa konstruktor B");
    }

    public B(boolean silent) {
        super(true);
        if (!silent) {
            System.out.println("Działa konstruktor B(" + silent + ")");
        }
    }

}

class C extends B {
    public C() {
        System.out.println("Działa konstruktor C");
    }

    public C(boolean silent) {
        super(true);
        if (!silent) {
            System.out.println("Działa konstruktor C(" + silent + ")");
        }
    }
}

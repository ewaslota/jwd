package constructors.lab;

/**
 * klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
 * instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
 * instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
 * instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)
 */
public class ConstructorTester {
    public static void main(String[] args) {
        new A();
        new B();
        new C();
    }
}

class A {
    public A() {
        System.out.println("Działa konstruktor A");
    }
}

class B extends A {
    public B() {
        System.out.println("Działa konstruktor B");
    }
}

class C extends B {
    public C() {
        System.out.println("Działa konstruktor C");
    }
}

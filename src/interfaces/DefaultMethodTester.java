package interfaces;

public class DefaultMethodTester implements MyInterface {

    public static void main(String[] args) {
        DefaultMethodTester dmt = new DefaultMethodTester();
        dmt.method();
        dmt.defaultMethod();

        MyInterface.staticMethod();
    }
    public void method() {
        System.out.println("Wywołuję metodę zaimplementowaną w klasie");
    }
}

interface MyInterface {
    void method();
    default void defaultMethod() {
        System.out.println("Wywołuję metodę zaimplementowaną w inferfejsie (domyślną):" + sum(1, 4));
    }

    static void staticMethod() {
        System.out.println("Wywołanie metody statycznej wywołanej w interfejsie");
    }

    private int sum (int a, int b) {
        return a + b;
    }
}

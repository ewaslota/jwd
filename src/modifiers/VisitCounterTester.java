package modifiers;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter vc = new VisitCounter();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();
        vc.increment();

        //vc.counter++; // słabe strony
        //vc.counter = 1000; // słabe strony
        //vc.counter = -1; //błąd, nie zastosowano hermetyzacji
        //System.out.println(vc.counter);

        System.out.println(vc.getCounter());


    }
}

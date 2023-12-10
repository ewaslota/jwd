package modifiers;

public class FinalTester /**extends String - nie może dziedziczyć po klasie String ponieważ jest final**/ {

    public static int number = 0;

    public static void main(String[] args) {
        FinalTester f1 = new FinalTester();
        FinalTester f2 = new FinalTester();
        FinalTester f3 = new FinalTester();

        System.out.println(f1.number);
        System.out.println(f2.number);
        System.out.println(f3.number);

        //zmieniamy pole statyczne
        f3.number = 99;

        System.out.println(f1.number);
        System.out.println(f2.number);
        System.out.println(f3.number);
    }

    void showNumber() {
        System.out.println(FinalTester.number);
    }
}

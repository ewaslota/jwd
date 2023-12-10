package modifiers;

public class Demo2 {
    static int factor = 8;
    public static void main(String[] args) {
//        Demo d1 = new Demo();
//        System.out.println(d1.number);
//
//        Demo d2 = new Demo();
//        System.out.println(d2.number);

        final int number;

        factor++;

        System.out.println("Start");
        number = 1;
        System.out.println("Koniec");
       // number = 7; nie możemy już zmienić "number", ale możemy przypisać wartość final
    }

    final int number;

    public Demo2() {
        this.number = 45;
    }

  //  final static int number = 0;
}

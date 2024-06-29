package collections;

public class Ferniture {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Addie", "IKEA", 2016);
        Chair chair2 = new Chair("Addie", "IKEA", 2016);

        System.out.println(chair1.hashCode());
        System.out.println(chair2.hashCode());

        System.out.println(chair1.equals(chair2));
    }


}

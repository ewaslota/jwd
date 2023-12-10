package modifiers;

public class Hamster extends Animal {
    private static String TYPE = "chomik";
    private static int counter;

    public Hamster() {
        counter++;
    }
    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }
}

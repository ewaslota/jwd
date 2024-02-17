package tests.modifiers;

public class Turtle extends Animal {

    private static String TYPE = "turtle";
    private static int counter;
    public Turtle() {
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

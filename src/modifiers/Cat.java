package modifiers;

public class Cat extends Animal {
    private static String TYPE = "kot";
    private static int counter;

    public Cat() {
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

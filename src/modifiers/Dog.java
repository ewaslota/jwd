package modifiers;

public class Dog extends Animal {
    private static String TYPE = "pies";
    private static int counter;

    public Dog() {
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

package nightworking;

/**
 * Stwórz Niedżwiedzia, który będzie brązowy, 1,80 m wzrostu, będzie biegał z prędkością 70 km/h i będzie ryczał z natężeniem
 * 90 dB. Stwórz metodę wyświetl detale.
 */
public class Bear {
    private String color;
    /**
     * Height of bear standing on two legs in cm
     */
    private int height;
    /**
     * Speed of bear in km/h
     */
    private int speed;
    /**
     * Roaring intensity in dB
     */
    private int dB;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setdB(int dB) {
        this.dB = dB;
    }

    public int getdB() {
        return dB;
    }

    public Bear(String color, int height, int speed, int dB) {
        this.color = color;
        this.height = height;
        this.speed = speed;
        this.dB = dB;
    }

    public void viewDetails() {
        System.out.println("Bear details:");
        System.out.println("Color: " + this.getColor());
        System.out.println("Height: " + this.getHeight());
        System.out.println("Speed: " + this.getSpeed());
        System.out.println("Roraring (dB): " + this.getdB());
    }

    public static void main(String[] args) {
        Bear bear = new Bear("brown", 180, 70, 90);
        bear.viewDetails();
    }
}

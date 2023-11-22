package nightworking.objects;

public class Shake {
    private String taste;
    private char size;
    private float price;

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String getTaste() {
        return taste;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public Shake(String taste, char size, float price) {
        this.setTaste(taste);
        this.setSize(size);
        this.setPrice(price);
    }

    public void showDetails() {
        System.out.println("Shake: ");
        System.out.println("Taste: " + getTaste());
        System.out.println("Size: " + getSize());
        System.out.println("Price: " + getPrice() + " zł");
    }
    public static void main(String[] args) {
        Shake shake = new Shake("Strawberry", 'S', 7.40f);
        shake.showDetails();
    }
}

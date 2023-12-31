package nightworking.objects;

import java.util.Objects;

/**
 * Create a class coffee with private attributes size, kind and sugar.
 * Create a method showing details.
 * Use setters and getters.
 * Test the class creating an object and calling the method on it.
 */
public class Coffee {
    private int size;
    private String kind;
    private int sugar;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    public Coffee(int size, String kind, int sugar) {
        this.setSize(size);
        this.setKind(kind);
        this.setSugar(sugar);
    }

    public void showDetails() {

        System.out.println("Coffee has: ");
        System.out.println("Size: " + getSize() + " ml");
        System.out.println("Kind: " + getKind());
        System.out.println("Sugar: " + getSugar() + " items");
    }

    public boolean equals(Coffee obj) {
        return this.size == obj.size && this.kind.equals(obj.kind) && this.sugar == obj.sugar;
    }

    public static void main(String[] args) {
        Coffee coffee1 = new Coffee(400, "White coffee", 3);
        Coffee coffee2 = new Coffee(400, "White coffee", 3);

        System.out.println(coffee1.equals(coffee2));


        coffee1.showDetails();
    }

}

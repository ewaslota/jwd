package nightworking.objects;

import java.util.Objects;

/**
 * Create a class Tea with private attributes size, kind and sugar
 * Use setters, getters and constructor.
 * Create a method showing details of a tea.
 * Test the class creating an object and calling the method on it.
 */
public class Tea {
    private char size;
    private String kind;
    private int sugar;

    public void setSize(char size){
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void  setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    public Tea(char size, String kind, int sugar) {
        this.setSize(size);
        this.setKind(kind);
        this.setSugar(sugar);
    }

    public void showDetails() {
        System.out.println("Tea size " + getSize());
        System.out.println("Tea kind " + getKind());
        System.out.println("Countity of sugar " + getSugar());
    }

    public boolean equals(Tea obj) {
        return this.size == obj.size && this.kind.equals(obj.kind) && this.sugar == obj.sugar;
    }

    public static void main(String[] args) {
        Tea tea1 = new Tea('M', "Earl Grey", 2);
        Tea tea2 = new Tea('M', "Earl Grey", 2);

        System.out.println(tea1.equals(tea2));
        tea1.showDetails();
    }
}

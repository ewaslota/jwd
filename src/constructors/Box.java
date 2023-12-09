package constructors;

import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    // alt + insert - generowanie konstruktora
    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}
   // public Box() {} - konstruktor bezargumentowy

//    public Box(Point topleft) {
//        this.x1 = topleft.x1;
//        this.y1 = topleft.y1
//        this.x2 = x2;
//        this.y2 = y2;
//}
//void printBox() {
//    System.out.println("Box: <" + this.x1 + ", " + this.y1);
//    System.out.println("; " + this.x2 + ", " + this.y2 + ">");
//}
//    public static void main(String[] args) {
//        overleading.Box rect = new overleading.Box();
//        rect.buildBox(25, 25, 50, 50);
//        System.out.println("Tworzymy Box ze współrzędnymi (25, 25) i (50,50)");
package overleading;

public class TestOverRiddingCat extends TestOverRiddingAnimal {
    //public void move() {
     //   System.out.println("Kot sie porusza");
   // }

    public static void main(String[] args) {
        TestOverRiddingAnimal animal = new TestOverRiddingAnimal();
        animal.move();

        TestOverRiddingCat cat = new TestOverRiddingCat();
        cat.move();
    }
}

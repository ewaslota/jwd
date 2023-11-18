package nightworking.animals;

public class Dog extends Animal {
    @Override
    public void eat(String food) {
        System.out.println("Hau hau, mniam mniam...");
    }

    public void sleep() {
        super.sleep();
        System.out.println("hau hau, hrrrr....");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat("bone");

        dog.sleep();
    }
}

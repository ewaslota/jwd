package modifiers;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Random random = new Random();
        Animal[] animals = new Animal[100];

        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Hamster();
            }

        }

        System.out.print("W 33 kojcu znajduje się " + animals[32].getType());
        System.out.println(", wszystkich zwierząt jest " + animals[32].getInstanceNumber() + " sztuk.");
    }
}

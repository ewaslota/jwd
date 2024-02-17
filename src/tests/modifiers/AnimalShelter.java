package tests.modifiers;
/*
Laboratorium 14
Napisz program symulujący działanie schroniska dla zwierząt, w tym celu:

stwórz abstrakcyjną klasę Animal z dwoma abstrakcyjnymi metodami getType() oraz getInstanceNumber()
zadaniem metody getType() będzie zwrócenie typu zwierzęcia jako tekst np. pies, kot itp.
zadaniem metody getInstanceNumber() będzie zwrócenie liczby utworzonych obiektów danej klasy (podklasy Animal)
stwórz 3 klasy reprezentujące zwierzęta, klasy powinny rozszerzać klasę Animal i implementować odpowiednie metody
w tworzonych klasach zastosuj zasady hermetyzacji
w klasie AnimalShelter przechowuj zwierzęta w tablicy 100-elementowej imitującej kojce (jeden kojec mieści jedno zwierzę)
zwierzęta umieszczaj w kojcach losowo
wyświetl informacje jakie zwierzę zostało umieszczone w kojcu nr 33 oraz ile tego rodzaju zwierząt przebywa obecnie w schronisku
Podpowiedź:

do wylosowania liczby całkowitej z przedziału od 0 do 2 użyj konstrukcji:
Random random = new Random();
int i = random.nextInt(3);
 */

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {

    Random random = new Random();
    Animal[] animal = new Animal[100];

        for (int i = 0; i < 100 ; i++) {
            int r = random.nextInt(3);
            switch(r) {
                case 0:
                    animal[i] = new Cat();
                    break;

                case 1:
                    animal[i] = new Dog();
                    break;

                case 2:
                    animal[i] = new Turtle();
            }
        }

        System.out.println("There is a " + animal[32].getType() + " in pen number 33.");
        System.out.println("There are " + animal[32].getInstanceNumber() + " of them in the shelter");
    }
 }

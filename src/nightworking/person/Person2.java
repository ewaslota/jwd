package nightworking.person;

/**
 * Osoba ma  imię Rafał, nazwisko Samek, 41 lata, wzrost 180 cm, waga 90 kg, brązowe włosy, niebieskie oczy. Użyj setterów
 * i getterów. Stwórz metodę która wyświetli detale.
 */
public class Person2 {
    private String firstname;
    private String surname;
    private int age;
    private int growth;
    private int weight;
    private String colorOfHair;
    private String colorOfEyes;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getGrowth() {
        return this.growth;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setColorOfHair(String colorOfHair) {
        this.colorOfHair = colorOfHair;
    }

    public String getColorOfHair() {
        return this.colorOfHair;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public String getColorOfEyes() {
        return this.colorOfEyes;
    }

    public Person2(String firstname, String surname, int age, int growth, int weight, String colorOfHair, String colorOfEyes) {
        this.setFirstname(firstname);
        this.setSurname(surname);
        this.setAge(age);
        this.setGrowth(growth);
        this.setWeight(weight);
        this.setColorOfHair(colorOfHair);
        this.setColorOfEyes(colorOfEyes);
    }

    public void viewDetails() {
        System.out.println("Imię: " + this.getFirstname());
        System.out.println("Nazwisko: " + this.getSurname());
        System.out.println("Wiek: " + this.getAge());
        System.out.println("Wzrost: " + this.getGrowth());
        System.out.println("Waga:" + this.getWeight());
        System.out.println("Kolor włosów: " + this.getColorOfHair());
        System.out.println("Kolor oczu: " + this.getColorOfEyes());
    }
    public static void main(String[] args) {
        Person2 person2 = new Person2("Rafał", "Samek", 41,180, 90, "brown", "blue");
        person2.viewDetails();
    }
}

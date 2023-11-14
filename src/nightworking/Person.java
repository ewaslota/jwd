package nightworking;


/**
 * Stwórz program, utworzy osobę o imieniu "Ewa", nazwisku "Słota" i wieku 29.
 * Następnie stwórz metodę, która wyświetli wszystkie detale stworzonego obiektu
 * Użyj konstruktora, setterów i getterów.
 */
public class Person {
    private String firstname;
    private String surname;
    private int age;

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

    public Person(String firstname, String surname, int age) {
        this.setFirstname(firstname);
        this.setSurname(surname);
        this.setAge(age);
    }

    public void viewDetails() {
        System.out.println("Firstname: " + this.getFirstname());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Age: " + this.getAge());
    }

    public static void main(String[] args) {
        Person person = new Person("Ewa", "Słota", 29);
        person.viewDetails();
    }
}


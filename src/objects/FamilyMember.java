package objects;

public class FamilyMember {
    static String surname = "Nowak";

    String name;
    int age;

    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Stefan";
        dad.age = 36;
        System.out.println("Nazwa rodu to: " + dad.surname); // nie używać, bo jest to zmienna klasowa
        System.out.println("Nazwa rodu to: " + FamilyMember.surname); // bardziej czytelnie unikniemy dwuznaczności

        System.out.println(dad.name); // pole name jest przypisane konkretnie do tego obiektu

    }
}

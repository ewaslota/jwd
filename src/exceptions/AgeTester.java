package exceptions;

public class AgeTester {
    public static void main(String[] args) {
        checkAge(15);

    }

    static void checkAge(int age) {
        if (age < 18) {

            throw new AgeRangeException("Uwaga ! Osoba niepełnoletnia!");
        } else {
            System.out.println("Dostęp przyznany......");
        }
    }
}

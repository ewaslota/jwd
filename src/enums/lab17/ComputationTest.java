package enums.lab17;

public class ComputationTest {
    public static void main(String[] args) {
        double x = 7;
        double y = 4;

        System.out.println("Dodawanie: " + Computation.ADD.perform(x, y));
        System.out.println("Odejmowanie: " + Computation.SUBSTRACT.perform(x, y));
        System.out.println("Mnożenie: " + Computation.MULTIPLY.perform(x, y));
        System.out.println("Dzielenie: " + Computation.DIVIDE.perform(x, y));
    }
}

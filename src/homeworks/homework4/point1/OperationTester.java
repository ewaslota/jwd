package homeworks.homework4.point1;

public class OperationTester {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println(a + " + " + b + " = " + addition.execute(a, b));
        System.out.println(a + " * " + b + " = " + multiplication.execute(a, b));
    }
}

package comparing;

import java.awt.*;

public class ToStringTester {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString());
        System.out.println(i);//ten sam efekt, metoda toString zainplementowana dla Integer, nie trzeba wypisywać

        Point point = new Point(3, 4);
        System.out.println();

        Employee employee = new Employee("Jan Kowalski0", 33, 5345);
        System.out.println(employee.toString());
    }
}

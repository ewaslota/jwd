package exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int hours = - 3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = etd.getNumberofSecond(hours);
        }catch (IllegalArgumentException e) {
            System.out.println("Nastąpiła korekta godzin, ponieważ:");
            numberOfSeconds = etd.getNumberofSecond(hours * -1);
        }
    }

    public int getNumberofSecond(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być większa od zera: " + hours);
        }
        return hours * 60 * 60;
    }
}

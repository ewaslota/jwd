package exceptions.lab16;

public class NegativeNumberException extends IllegalArgumentException {
    public NegativeNumberException() {
    }

    public NegativeNumberException(String s) {
        super(s);
    }

    public NegativeNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeNumberException(Throwable cause) {
        super(cause);
    }
}

package npopov.Lab8;

public class WrongLoginException extends Exception {

    String message;

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

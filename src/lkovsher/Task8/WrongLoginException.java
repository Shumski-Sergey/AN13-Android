package lkovsher.Task8;

public class WrongLoginException extends Exception{
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public WrongLoginException(String message) {
        this.message = message;
    }

    public WrongLoginException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}

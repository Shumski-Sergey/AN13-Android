package lkovsher.Task8;

public class WrongPasswordExeption extends Exception{
    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public WrongPasswordExeption(String message) {
        this.message = message;
    }

    public WrongPasswordExeption(String message, String message1) {
        super(message);
        this.message = message1;
    }
}

package ibagritsevich.lection_8.Authorization;

public class WrongPasswordException extends Exception{

    private String message;

    public WrongPasswordException (String password, String message) {
        this.message = message;
    }

    public WrongPasswordException () {
    }

    public String toString() {
        return message;
    }
}

package ibagritsevich.lection_8.Authorization;

public class WrongLoginException extends Exception {

    private String message;

     public WrongLoginException(String login, String message) {
        this.message = message;
     }

    public WrongLoginException() {
    }

    public String toString() {
        return message;
    }
}

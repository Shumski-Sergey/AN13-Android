package aalekseenko.Lection8;

public class WrongPasswordException extends Exception{
    String messageException;

    @Override
    public String getMessage() {
        return messageException;
    }

    public WrongPasswordException(String message) {
        this.messageException = message;
    }

    public WrongPasswordException(String messageException, String messageException1) {
        super(messageException);
        this.messageException = messageException1;
    }
}

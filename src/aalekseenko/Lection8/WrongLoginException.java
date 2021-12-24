package aalekseenko.Lection8;

public class WrongLoginException extends Exception{
    String messageException;

    @Override
    public String getMessage() {
        return messageException;
    }

    public WrongLoginException(String messageException) {
        this.messageException = messageException;
    }

    public WrongLoginException(String messageException, String messageException1) {
        super(messageException);
        this.messageException = messageException1;
    }
}

package ibagritsevich.lection_8.Authentication;

public class WrongPasswordException extends  Exception {

    private String PasswordMessage;

    public WrongPasswordException(String PasswordMessage) {
        this.PasswordMessage = PasswordMessage;
    }

    public WrongPasswordException() {
    }

    public String toString() {
        return PasswordMessage;
    }
}

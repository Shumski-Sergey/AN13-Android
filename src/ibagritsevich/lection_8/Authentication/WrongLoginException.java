package ibagritsevich.lection_8.Authentication;

public class WrongLoginException extends Exception {

    private String LoginMessage;

    public WrongLoginException(String LoginMessage) {this.LoginMessage = LoginMessage;}

    public WrongLoginException() {
    }

    public String toString() {
        return LoginMessage;
    }
}

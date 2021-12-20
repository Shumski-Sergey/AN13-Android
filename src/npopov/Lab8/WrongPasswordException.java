package npopov.Lab8;

public class WrongPasswordException extends Exception{

    String message;
    public WrongPasswordException(){
    }

    public WrongPasswordException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

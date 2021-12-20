package npopov.Lab8;

public class Examination {

    public void examinationLogin(String login) throws WrongLoginException {
        if (login.length() > 20 || (!(login.matches("[A-Za-z0-9_]+")))) {
            throw new WrongLoginException();
        }
    }

    public void examinationPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!(password.length() > 20 || (!(password.matches("[A-Za-z0-9_]+"))) || password.equals(confirmPassword))) {
            throw new WrongPasswordException();
        }
    }

    //через boolean не получилось

    /*public boolean examinationF(String password, String login, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        return true;
    }*/
}

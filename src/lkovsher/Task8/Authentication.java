package lkovsher.Task8;

public class Authentication {
    String login;
    String password;
    String confimPassword;

    public Authentication(String login, String password, String confimPassword) {
        this.login = login;
        this.password = password;
        this.confimPassword = confimPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfimPassword() {
        return confimPassword;
    }

    public void controlPassword() throws WrongPasswordExeption {
        if(getPassword().length() > 20 || (!(getPassword().matches("[A-Za-z0-9_]+"))) || getPassword() != getConfimPassword() ) throw new WrongPasswordExeption("Ошибка при введении пароля.");
    }

    public void controlLogin() throws WrongLoginException{
        if(getLogin().length() > 20 || (!(getLogin().matches("[A-Za-z0-9_]+")))) throw new WrongLoginException("Ошибка при введении логина.");
    }
}

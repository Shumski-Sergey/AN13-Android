package aalekseenko.Lection8;

public class Registration {
    String login;
    String password;
    String confirmPassword;

    public Registration(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void checkPassword() throws WrongPasswordException {
        if(password.length() > 20 || (!(password.matches("[A-Za-z0-9_]+"))) || password != confirmPassword ) {throw
                new WrongPasswordException("Ошибка - пароль должен содержать только латинские буквы, цифры и знак подчеркивания. Длина пароля должна быть меньше 20 символов.");
    } else System.out.println("Пароль соответствует правилам ввода");}

    public void checkLogin() throws WrongLoginException {
        if(login.length() > 20 || (!(login.matches("[A-Za-z0-9_]+")))) {throw
                new WrongLoginException("Ошибка - логин должен содержать только латинские буквы, цифры и знак подчеркивания. Длина логина должна быть меньше 20 символов");
    } else System.out.println("Логин соответствует правилам ввода");}
}

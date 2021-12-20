package npopov.Lab8;

public class InformationUser {

    private String password;
    private String confirmPassword;
    private String login;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

package nshekov.lesson8;

public class Task_1 {
    public static void main(String[] args) {
        boolean b = examinationLogin ("123qwe_dhuehj", "qwerty1", "qwerty1");
        System.out.println(b);
    }

    public static boolean examinationLogin(String login, String password, String confirmPassword) {
        boolean log = login.matches("[a-zA-Z0-9_]{1,19}$");
        boolean pass = password.matches("[a-zA-Z0-9_]{1,19}$");
        boolean counter = true;
        try {
            if (!log) throw new WrongLoginException("Логин не соответствует указанному диапазону!");
            if (!pass) throw new WrongPasswordException("Пароль не соответствует заданному диапазону");
            if (!password.equals(confirmPassword)){
                System.out.println("Пароли не совпадают");
                counter = false;
            }
        } catch (WrongLoginException | WrongPasswordException ex){
            System.out.println(ex.getMessage());
        }
        return log && pass && counter;
    }
}


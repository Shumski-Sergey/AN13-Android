package ibagritsevich.lection_8.Authentication;

import java.util.Scanner;

public class Authentication {

    public static void main(String[] args) throws Exception {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите логин: ");
            String login = scanner.next();
            System.out.print("Введите пароль: ");
            String password = scanner.next();
            System.out.println(authentication(login, password));
        } catch (Exception  e) {
            System.out.println("Перехваченное исключение: " + e);
        }
    }

    static String authentication(String login, String password)
            throws Exception {
        if (!login.equals(User.Login) && (!password.equals(User.Password))) {
            throw new Exception("Логин не совпадает" + "\nПароль не совпадает");
        } else if (!login.equals(User.Login)) {
            throw new WrongLoginException("Логин не совпадает");
        } else if (!password.equals(User.Password)) {
            throw new WrongPasswordException("Пароль не совпадает");
        } else System.out.println("Пользователь успешно аутентифицирован");
        return "Правильный логин и пароль";
    }
}

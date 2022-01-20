package ibagritsevich.lection_8.Authorization;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Authorization {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите логин: ");
            String login = scanner.next();
            System.out.print("Введите пароль: ");
            String password = scanner.next();
            System.out.print("Подтвердите пароль: ");
            String confirmPassword = scanner.next();
            System.out.println(authorization(login,password,confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Перехваченное исключение" + "\t" + e);
        }

    }
    static String authorization(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9_]+");

        if (!login.matches(String.valueOf(pattern)) || login.length() > 20) {
            throw new WrongLoginException(login, "Неверный логин");
        }
        else if (!password.matches(String.valueOf(pattern)) || password.length() > 20) {
            throw new WrongPasswordException(password, "Неверный пароль");
        }
        else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password, "Пароли не совпадают");
        }
        else System.out.println("Вы успешно вошлм в аккаунт");
        return "Правильный логин и пароль";
    }
}
package ryancharuk.LabEight.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Login {


	static void entrance(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {

		Pattern pattern = Pattern.compile("^[\\w]{1,20}$");

		if (! login.matches("^[\\w]{1,20}$")) {
			throw new WrongLoginException(login, "Some message");
//		} else System.out.println("Login принят");
		} else if (! pattern.matcher(login).matches()) {
			throw new WrongPasswordException(password, "some message");
//		} else System.out.println("Пароль принят");
		} else if (password.equals(confirmPassword)) {
			System.out.println("Вы успешно вошли в аккаунт");
		} else System.out.println("Пороли не совпадают повторите попытку");

	}

	public static void main(String[] args) throws WrongLoginException, IOException {

		String login;
		String password;
		String confPass;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Введите Login: ");
			login = reader.readLine();
			System.out.print("Введите пароль: ");
			password = reader.readLine();
			System.out.print("Повторите пароль: ");
			confPass = reader.readLine();
			entrance(login, password, confPass);

		} catch (WrongLoginException | WrongPasswordException e) {
			System.out.println("Перехваченное исключение " + e);
		}

	}
}

package ryancharuk.LabEight.Exception;

public class WrongLoginException extends Exception {

	public WrongLoginException() {
	}

	public WrongLoginException(String login, String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "Login должен содержать только латинские буквы, цифры и знак подчеркивания.\n Длина login должна быть меньше 20 символов";
	}
}


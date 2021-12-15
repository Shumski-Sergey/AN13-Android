package ryancharuk.LabEight.Exception;

public class WrongPasswordException extends Exception {

	public WrongPasswordException(String password, String message) {
		super(message);
	}

	@Override
	public String toString() {
		return "Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов";
	}
}

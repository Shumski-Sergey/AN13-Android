package npopov.Lab8;

import java.util.Scanner;

import static java.lang.System.*;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        InformationUser informationUser = new InformationUser();
        out.println("Введите логин:");
        informationUser.setLogin(scanner.nextLine());
        out.println("Введите пароль:");
        informationUser.setPassword(scanner.nextLine());
        out.println("Введите пароль второй раз:");
        informationUser.setConfirmPassword(scanner.nextLine());
        Examination examination = new Examination();
        try {
            examination.examinationLogin(informationUser.getLogin());
            examination.examinationPassword(informationUser.getPassword(), informationUser.getConfirmPassword());
        } catch (WrongLoginException e) {
            out.println("Логин введен не верно");
        } catch (WrongPasswordException e) {
            out.println("Пароль введен не верно");
        } finally {
            out.println("Логин: ".concat(informationUser.getLogin()).concat("\nПароль: " + informationUser.getPassword()));
        }
    }
}

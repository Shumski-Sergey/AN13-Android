package kvitko.Lab8;

/*Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
        Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов.
        Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
        Password должен содержать только латинские буквы, цифры и знак подчеркивания.
        Длина password должна быть меньше 20 символов.
        Также password и confirmPassword должны быть равны.
        Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
        WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
        второй принимает сообщение исключения и передает его в конструктор класса Exception.
        Обработка исключений проводится внутри метода.
        Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае.*/

import java.util.Objects;
import java.util.Scanner;

public class Password {
    String login, password, confirmPassword;

    public void Password1()  {
        Scanner scanner = new Scanner(System.in);
        boolean Log, Pass;
        try {
            System.out.print("Enter login:");
            this.login =scanner.nextLine();
            Log=login.matches("[a-zA-Z0-9_]{1,19}$");
            if(!Log) throw new WrongLoginException("Wrong login input");
            System.out.print("Enter password: ");
            this.password = scanner.nextLine();
            Pass=password.matches("[a-zA-Z0-9_]{1,19}$");
            if(!Pass) throw new WrongPasswordException("Wrong password input");
            System.out.print("Confirm password: ");
            this.confirmPassword = scanner.nextLine();
            if(!Objects.equals(confirmPassword, password)) {
                System.out.println("Passwords are not the same");
            }
        }

        catch (WrongLoginException | WrongPasswordException mistake ){
            System.out.println(mistake.getMessage());
        }
        }
}



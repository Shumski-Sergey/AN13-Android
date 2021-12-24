package aalekseenko.Lection8;

/*
Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов.
Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям,
необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Обработка исключений проводится внутри метода. Используем multi-catch block.
Метод возвращает true, если значения верны или false в другом случае.
 */

public class Runner {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Registration registration = new Registration("gcsdcg4rg5", "d33", "d33");
        try{
            registration.checkLogin();
        } catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }
        try{
                registration.checkPassword();
            } catch(WrongPasswordException e){
                System.out.println(e.getMessage());
            }
        }

    }



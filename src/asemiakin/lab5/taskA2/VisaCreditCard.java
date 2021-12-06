package asemiakin.lab5.taskA2;

//работает с долларами
public class VisaCreditCard extends CreditCard {
    protected VisaCreditCard(String nameOfCardUser, int accountBalance, int numberCard, int pin, int codeCVV, int credit) {
        super(nameOfCardUser, accountBalance, numberCard, pin, codeCVV, credit);
    }

    @Override
    protected void displayInformationAbout() {
        System.out.println('\n' + "Информация по банковской карте:");
        System.out.println("Имя владельца карты - " + getNameOfCardUser());
        System.out.println("Баланс - " + getAccountBalance() + " USD");
        System.out.println("Задолженность по кредиту - " + getCredit() + " USD");
        System.out.println("Номер карты - " + getNumberCard());
        System.out.println("ПИН-код карты - " + getPin());
        System.out.println("CVV-код карты - " + getCodeCVV());
    }
}

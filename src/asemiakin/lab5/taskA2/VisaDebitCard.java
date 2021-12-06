package asemiakin.lab5.taskA2;

//работает с долларами
public class VisaDebitCard extends DebitCard {
    protected VisaDebitCard(String nameOfCardUser, int accountBalance, int numberCard, int pin, int codeCVV) {
        super(nameOfCardUser, accountBalance, numberCard, pin, codeCVV);
    }

    @Override
    protected void displayInformationAbout() {
        System.out.println('\n' + "Информация по банковской карте:");
        System.out.println("Имя владельца карты - " + getNameOfCardUser());
        System.out.println("Баланс - " + getAccountBalance() + " USD");
        System.out.println("Номер карты - " + getNumberCard());
        System.out.println("ПИН-код карты - " + getPin());
        System.out.println("CVV-код карты - " + getCodeCVV());
    }
}

package asemiakin.lab5.taskA2;

//работает с евро
public class MasterDebitCard extends DebitCard {
    protected MasterDebitCard(String nameOfCardUser, int accountBalance, int numberCard, int pin, int codeCVV) {
        super(nameOfCardUser, accountBalance, numberCard, pin, codeCVV);
    }

    @Override
    protected void displayInformationAbout() {
        System.out.println('\n' + "Информация по банковской карте:");
        System.out.println("Имя владельца карты - " + getNameOfCardUser());
        System.out.println("Баланс - " + getAccountBalance() + " EUR");
        System.out.println("Номер карты - " + getNumberCard());
        System.out.println("ПИН-код карты - " + getPin());
        System.out.println("CVV-код карты - " + getCodeCVV());
    }
}

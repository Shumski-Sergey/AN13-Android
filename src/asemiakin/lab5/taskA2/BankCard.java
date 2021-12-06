package asemiakin.lab5.taskA2;

public abstract class BankCard {
    String nameOfCardUser;
    int accountBalance;
    int numberCard;
    int pin;
    int codeCVV;

    protected BankCard(String nameOfCardUser, int accountBalance, int numberCard, int pin, int codeCVV) {
        this.nameOfCardUser = nameOfCardUser;
        this.accountBalance = accountBalance;
        this.numberCard = numberCard;
        this.pin = pin;
        this.codeCVV = codeCVV;
    }

    protected String getNameOfCardUser() {
        return nameOfCardUser;
    }

    protected int getAccountBalance() {
        return accountBalance;
    }

    protected int getNumberCard() {
        return numberCard;
    }

    protected int getPin() {
        return pin;
    }

    protected int getCodeCVV() {
        return codeCVV;
    }

    protected void displayInformationAbout() {
        System.out.println('\n' + "Информация по банковской карте:");
        System.out.println("Имя владельца карты - " + getNameOfCardUser());
        System.out.println("Баланс - " + getAccountBalance());
        System.out.println("Номер карты - " + getNumberCard());
        System.out.println("ПИН-код карты - " + getPin());
        System.out.println("CVV-код карты - " + getCodeCVV());
    }
}

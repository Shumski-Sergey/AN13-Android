package asemiakin.lab5.taskA2;

public abstract class DebitCard extends BankCard {
    protected DebitCard(String nameOfCardUser, int accountBalance, int numberCard, int pin, int codeCVV) {
        super(nameOfCardUser, accountBalance, numberCard, pin, codeCVV);
    }
}

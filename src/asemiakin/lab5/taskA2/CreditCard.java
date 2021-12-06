package asemiakin.lab5.taskA2;

import java.util.Scanner;

public abstract class CreditCard extends BankCard {
    int credit;

    protected CreditCard(String nameOfCardUser, int accountBalance, int numberCard, int pin, int codeCVV, int credit) {
        super(nameOfCardUser, accountBalance, numberCard, pin, codeCVV);
        this.credit = credit;
    }

    protected int getCredit() {
        return credit;
    }

    void takeCredit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print('\n' + "Введите сумму, которую хотите взять в кредит: ");
        credit += scanner.nextInt();
    }

    @Override
    protected void displayInformationAbout() {
        System.out.println('\n' + "Информация по банковской карте:");
        System.out.println("Имя владельца карты - " + getNameOfCardUser());
        System.out.println("Баланс - " + getAccountBalance());
        System.out.println("Задолженность по кредиту - " + getCredit());
        System.out.println("Номер карты - " + getNumberCard());
        System.out.println("ПИН-код карты - " + getPin());
        System.out.println("CVV-код карты - " + getCodeCVV());
    }
}

package asemiakin.lab5.taskA2;

public class Main {
    public static void main(String[] args) {
        MasterDebitCard masterDebitCard = new MasterDebitCard("Фыва А. Г.", 200, 475, 223, 333);
        MasterCreditCard masterCreditCard = new MasterCreditCard("Бескредитный Х. О.", 123, 546, 123, 444, 0);
        VisaDebitCard visaDebitCard = new VisaDebitCard("Караст Р. Ф.", 50, 441, 839, 523);
        VisaCreditCard visaCreditCard = new VisaCreditCard("Кредитный Л. В.", 100, 397, 345, 111, 200);

        masterDebitCard.displayInformationAbout();
        masterCreditCard.displayInformationAbout();
        visaDebitCard.displayInformationAbout();
        visaCreditCard.displayInformationAbout();

        masterCreditCard.takeCredit();
        masterCreditCard.displayInformationAbout();
    }
}

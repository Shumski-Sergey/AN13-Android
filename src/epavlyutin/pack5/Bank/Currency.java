package epavlyutin.pack5.Bank;

public class Currency extends Card {
    private String typeCurrency;

    public Currency(String bankName, String colorCard, String nameCard, String cardNumber, String typeCurrency) {
        super(bankName, colorCard, nameCard, cardNumber);
        this.typeCurrency = typeCurrency;
    }

    public void info() {
        System.out.println("Банк: ".concat(getBankName()) + " " + "цвет карты: ".concat(getColorCard()) + "\n"
                + "Владелец карты: ".concat(getNameCard()) + " " + "цифры с карты: ".concat(getCardNumber()) + "\n"
                + "Валюта: ".concat(typeCurrency));
    }

    public String getTypeCurrency() {
        return typeCurrency;
    }
}

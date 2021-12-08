package npopov.Lab5.A2Lab5;

public class PaymentCard extends Card {

    private String cardNumber;
    private String nameHolder;
    private String surnameHolder;

    PaymentCard(String bankName, String paymentSystem, String cardNumber, String nameHolder, String surnameHolder) {
        super(bankName, paymentSystem);
        this.cardNumber = cardNumber;
        this.surnameHolder = surnameHolder;
        this.nameHolder = nameHolder;
    }

    protected String getNameHolder() {
        return nameHolder;
    }

    protected String getSurnameHolder() {
        return surnameHolder;
    }

    protected String getCardNumber() {
        return cardNumber;
    }
}

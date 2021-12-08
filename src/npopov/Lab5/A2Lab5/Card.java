package npopov.Lab5.A2Lab5;

public class Card {

    private String bankName;
    private String paymentSystem;

    Card(String bankName, String paymentSystem) {
        this.bankName = bankName;
        this.paymentSystem = paymentSystem;
    }

    protected String getBankName() {
        return bankName;
    }

    protected String getPaymentSystem() { return paymentSystem; }

}

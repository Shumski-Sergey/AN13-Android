package aalekseenko.Lection5.TaskA2;

public class CreditCard extends Cards{
    String paymentSystem;

    public CreditCard(String owner, String bank, String paymentSystem) {
        super(owner, bank);
        this.paymentSystem = paymentSystem;
    }

    public String getPaymentSystem() {return paymentSystem;}

    public void displayInfo() {
        System.out.println("Информация о банковской карте: владелец - " + getOwner() + ", банк - " + getBank() + ", система платежей - " + getPaymentSystem());
    }
}

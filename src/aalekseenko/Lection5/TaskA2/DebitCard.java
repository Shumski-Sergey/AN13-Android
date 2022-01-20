package aalekseenko.Lection5.TaskA2;

public class DebitCard extends Cards {
    String paymentSystem;

    public DebitCard(String owner, String bank, String type) {
        super(owner, bank);
        this.paymentSystem = type;
    }

    public String getPaymentSystem() { return (paymentSystem); }

    public void displayInfo() {
        System.out.println("Информация о банковской карте: владелец - " + getOwner() + ", банк - " + getBank() + ", система платежей - " + getPaymentSystem());
    }

}


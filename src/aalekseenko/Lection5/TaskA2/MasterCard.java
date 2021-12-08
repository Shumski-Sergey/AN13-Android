package aalekseenko.Lection5.TaskA2;

public class MasterCard extends CreditCard{

    public MasterCard(String owner, String bank, String paymentSystem) {
        super(owner, bank, paymentSystem);
    }
    public void displayInfo() {
        System.out.println("Информация о банковской карте: владелец - " + getOwner() + ", банк - " + getBank() + ", система платежей - " + getPaymentSystem() + ", карта - MasterCard");
    }
}

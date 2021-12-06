package vikonnikova.lab5TaskA2;

public class MasterCard extends CreditCard {
    public MasterCard(String owner, int number, String bank, String paymentSystem) {
        super(owner, number, bank,paymentSystem);
    }
    public void displayInfo() {
        System.out.println("Владелец карты: " + getOwner() + "номер карты: " + getNumber() + "банк: " + getBank() + "платежная система: " + getPaymentSystem());
    }
}


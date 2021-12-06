package vikonnikova.lab5TaskA2;

public class VisaCard extends CreditCard {
       public VisaCard(String owner, int number, String bank, String paymentSystem) {
        super(owner, number, bank, paymentSystem);
    }
        public void displayInfo() {
            System.out.println("Владелец карты: " + getOwner() + "номер карты: " + getNumber() + "банк: " + getBank() + "платежная система: " + getPaymentSystem());
        }
    }



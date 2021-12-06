package vikonnikova.lab5TaskA2;

public class CreditCard extends Cards {
        String paymentSystem;
        public String getPaymentSystem() { return (paymentSystem); }

        public CreditCard(String owner, int number, String bank, String paymentSystem) {
            super(owner, number, bank);
            this.paymentSystem = paymentSystem;
        }

        @Override
        public void displayInfo() {
            System.out.println("Владелец карты: " + getOwner() + "номер карты: " + getNumber() + "банк: " + getBank() + "платежная система: " + getPaymentSystem());
        }
    }


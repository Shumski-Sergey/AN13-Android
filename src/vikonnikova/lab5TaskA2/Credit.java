package vikonnikova.lab5TaskA2;

public class Credit extends Cards {
        String paymentSystem;
        public String getPaymentSystem() { return (paymentSystem); }

        public Credit(String name, int number, String bank, String paymentSystem) {
            super(name, number, bank);
            this.paymentSystem = paymentSystem;
        }

        @Override
        public void displayInfo() {
        }
    }


package ibagritsevich.lection_5.TaskA2;

public class DebitCard extends BankCards {

    double client_money;

    public DebitCard(String type, String owner, String bank, String payment_system, String validity, long number, double client_money) {
        super(type, owner, bank, payment_system, validity, number);
        this.client_money = client_money;
    }

    public double getClient_money() {return client_money;}
}

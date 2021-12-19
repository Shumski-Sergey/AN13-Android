package ibagritsevich.lection_5.TaskA2;

public class CreditCard extends BankCards {

    int credit_sum;
    double rate;
    int grace_period;

    CreditCard(String type, String owner, String bank, String payment_system, String validity, long number,
               int credit_sum, double rate, int grace_period) {
        super(type, owner, bank, payment_system, validity, number);
        this.credit_sum = credit_sum;
        this.rate = rate;
        this.grace_period = grace_period;
    }

    public int getCredit_sum() {return credit_sum;}
    public double getRate() {return rate;}
    public  int getGrace_period() {return grace_period;}
}

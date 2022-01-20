package ibagritsevich.lection_5.TaskA2;

public class AlfaCredit extends CreditCard {

    public AlfaCredit(String type, String owner, String bank, String payment_system, String validity, long number,
                      int credit_sum, double rate, int grace_period) {
        super(type, owner , bank, payment_system, validity, number, credit_sum, rate, grace_period);
    }

    public void CardInfo() {
        System.out.println("\nВид банковской карты: " + super.getType() + "\nВладелец: " + super.getOwner() + "\nБанк: " + super.getBank()
                + "\nПлатежная система: " + super.getPayment_system() + "\nСрок действия карты: " + getValidity() +  "\nНомер карты:" + super.getNumber()
                + "\nСумма кредита, руб.: " + super.getCredit_sum() + "\nСтавка от, %: " + getRate() + "\nЛьготный период, дней: " + getGrace_period());
    }
}

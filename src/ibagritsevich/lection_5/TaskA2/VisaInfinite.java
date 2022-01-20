package ibagritsevich.lection_5.TaskA2;

public class VisaInfinite extends DebitCard {

    int percentage_balance;

    public VisaInfinite(String type, String owner, String bank, String payment_system, String validity, long number, double client_money, int percentage_balance) {
        super(type, owner, bank, payment_system, validity, number, client_money);
        this.percentage_balance = percentage_balance;
    }

    public int getPercentage_balance() {return percentage_balance;}

    public void CardInfo(){
        System.out.println("\nВид банковской карты: " + super.getType() + "\nВладелец: " + super.getOwner() + "\nБанк: " + super.getBank()
                + "\nПлатежная система: " + super.getPayment_system() + "\nСрок действия карты: " + super.getValidity() + "\nНомер карты:" + super.getNumber()
                + "\nДеньги клиента, руб.: " + super.getClient_money() + "\nПроцент на остаток, %: " + getPercentage_balance());
    }
}

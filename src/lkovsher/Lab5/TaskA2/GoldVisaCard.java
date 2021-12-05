package lkovsher.Lab5.TaskA2;

public class GoldVisaCard extends DebitCard{
    double cashbackParcentage;

    public GoldVisaCard(long numberCard, String owner, double amountOfMoney, double parcentageCashback) {
        super(numberCard, owner, amountOfMoney);
        this.cashbackParcentage = parcentageCashback;
    }

    public double getParcentageCashback() {
        return cashbackParcentage;
    }

    public void print(){
        System.out.println("Gold Visa:" + "\n" + "Владелец:" + this.getOwner() + "\n" + "Номер карты: " + this.getNumberCard()
                + "\n" + "Сумма на счете: " + this.getAmountOfMoney() + "\n" + "Начисляемый процент кэшбэка: " + this.getParcentageCashback());
    }
}

package lkovsher.Lab5.TaskA2;

public class DebitCard extends BankCard {
    double amountOfMoney;

    public DebitCard(long numberCard, String owner, double amountOfMoney) {
        super(numberCard, owner);
        this.amountOfMoney = amountOfMoney;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }
    public void print(){
        System.out.println("Gold Visa:" + "\n" + "Владелец:" + this.getOwner() + "\n" + "Номер карты: " + this.getNumberCard()
                + "\n" + "Сумма на счете: " + this.getAmountOfMoney() + "\n");
    }
}

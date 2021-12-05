package lkovsher.Lab5.TaskA2;

public class CreditCard extends BankCard {
    double loanPercentage;

    public CreditCard(long numberCard, String owner, double loanPercentage) {
        super(numberCard, owner);
        this.loanPercentage = loanPercentage;
    }

    public double getLoanPercentage() {
        return loanPercentage;
    }

    public void print(){
        System.out.println("Credit card:" + "\n" + "Владелец:" + this.getOwner() + "\n" + "Номер карты: " + this.getNumberCard()
             + "\n" + "Начисляемый процент: " + this.getLoanPercentage());
    }
}

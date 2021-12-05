package lkovsher.Lab5.TaskA2;

public class BankCard {
    long numberCard;
    String owner;

    public BankCard(long numberCard, String owner) {
        this.numberCard = numberCard;
        this.owner = owner;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public String getOwner() {
        return owner;
    }


}

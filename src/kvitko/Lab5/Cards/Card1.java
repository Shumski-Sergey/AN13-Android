package kvitko.Lab5.Cards;

public class Card1 extends Bank {
    String ForWhat;
    public Card1(String Material, String bank, String Number, String Name, String ForWhat){
        super(Material,bank, Number, Name);
        this.ForWhat=ForWhat;
    }

    public String getForWhat() {
        return ForWhat;
    }
}

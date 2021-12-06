package kvitko.Lab5.Cards;

public class Bank extends Card {
    String bank;
    String Number;
    String Name;


    public Bank(String Material, String bank, String Number, String Name) {
        super(Material);
        this.bank = bank;
        this.Number = Number;
        this.Name = Name;
    }

    public String getBank() {
        return bank;
    }

    public String getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }
}

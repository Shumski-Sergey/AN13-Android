package mshpudeyko.Practice4.Tsk4;

public class BelagrapromBank extends BankCard {
String color;
String ownerName;

    public BelagrapromBank(String bank, String number, String date, String color, String ownerName) {
        super(bank, number, date);
        this.color = color;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }
}

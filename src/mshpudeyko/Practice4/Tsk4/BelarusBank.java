package mshpudeyko.Practice4.Tsk4;

public class BelarusBank extends BankCard {
String type;
String contact;

    public BelarusBank(String bank, String number, String date, String type, String contact) {
        super(bank, number, date);
        this.type = type;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public String getType() {
        return type;
    }
}

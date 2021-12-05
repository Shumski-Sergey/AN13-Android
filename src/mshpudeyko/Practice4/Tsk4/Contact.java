package mshpudeyko.Practice4.Tsk4;

public class Contact extends BelarusBank {
    public Contact(String bank, String number, String date, String type, String contact) {
        super(bank, number, date, type, contact);
    }

    @Override
    public void print() {
        System.out.println("Name of bank: "+getBank()+"\t\tNumber of card: "+getNumber()+
                "   Card expiration date: "+getDate() +"   Contactless payment: "+getContact());
    }
}

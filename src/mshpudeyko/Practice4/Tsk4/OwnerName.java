package mshpudeyko.Practice4.Tsk4;

public class OwnerName extends BelagrapromBank{
    public OwnerName(String bank, String number, String date, String color, String ownerName) {
        super(bank, number, date, color, ownerName);
    }
    public void print() {
        System.out.println("Name of bank: "+getBank()+"   Number of card: "+getNumber()+
                "   Card expiration date: "+getDate()+"   Owner's name: "+getOwnerName());
    }
}

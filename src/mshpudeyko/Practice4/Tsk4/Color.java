package mshpudeyko.Practice4.Tsk4;

public class Color extends BelagrapromBank{
    public Color(String bank, String number, String date, String color, String ownerName) {
        super(bank, number, date, color, ownerName);
    }

    @Override
    public void print() {
        System.out.println("Name of bank: "+getBank()+"   Number of card: "+getNumber()+
                "   Card expiration date: "+getDate()+"   Color of card: "+getColor());
    }
}

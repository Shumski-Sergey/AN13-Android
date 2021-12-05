package mshpudeyko.Practice4.Tsk3;

public class Fridge extends ForCooking {
    public Fridge(int price, String name, boolean onOFF, String purpose) {
        super(price, name, onOFF, purpose);
    }
    @Override
    public void print() {
        System.out.println("Price: "+getPrice()+"\tname: "+getName()+"\tconnect with power socket: "+onOFF()+
                "\tpurpose: "+getPurpose());
    }
}

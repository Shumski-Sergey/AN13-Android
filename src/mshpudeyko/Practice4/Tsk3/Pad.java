package mshpudeyko.Practice4.Tsk3;

public class Pad extends ForEducation{
    public Pad(int price, String name,boolean onOFF, String sizeOfScreen) {
        super(price, name,onOFF, sizeOfScreen);
    }

    @Override
    public void print() {
        System.out.println("Price: "+getPrice()+"\tname: "+getName()+"\tconnect with power socket: "+onOFF()+
                "\tsize of screen: "+getSizeOfScreen());
    }
}

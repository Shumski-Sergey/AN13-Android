package mshpudeyko.Practice4.Tsk3;

public class ForEducation extends Technic {
    String sizeOfScreen;

    public String getSizeOfScreen() {
        return sizeOfScreen;
    }

    public ForEducation(int price, String name, boolean onOFF, String sizeOfScreen) {
        super(price, name, onOFF);
        this.sizeOfScreen = sizeOfScreen;
    }
}

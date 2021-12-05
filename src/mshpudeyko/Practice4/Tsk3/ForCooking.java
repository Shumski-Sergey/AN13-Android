package mshpudeyko.Practice4.Tsk3;

public class ForCooking extends Technic {
    String purpose;

    public String getPurpose() {
        return purpose;
    }

    public ForCooking(int price, String name, boolean onOFF, String purpose) {
        super(price, name, onOFF);
        this.purpose = purpose;
    }
}

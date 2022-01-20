package vabramchuk.Lab7.Lab_Robot.legs;

public class SonyLeg implements ILeg {
    private int price = 6;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {

    }

    @Override
    public void step() {
        System.out.println("Идет ногами Sony \n");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

package ibagritsevich.lection_6.Robot.legs;

public class SonyLeg implements ILeg {

    private int price = 200;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void Step() { System.out.println("Нога Sony сделала шаг"); }

    @Override
    public int getPrice() {
        return price;
    }
}
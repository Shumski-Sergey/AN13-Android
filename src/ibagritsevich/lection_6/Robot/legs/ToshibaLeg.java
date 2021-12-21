package ibagritsevich.lection_6.Robot.legs;

public class ToshibaLeg implements ILeg {

    private int price = 150;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void Step() { System.out.println("Нога Toshiba сделала шаг"); }

    @Override
    public int getPrice() {
        return price;
    }
}
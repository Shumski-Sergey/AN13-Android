package ibagritsevich.lection_6.Robot.legs;

public class SamsungLeg implements ILeg {

    private int price = 170;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void Step() { System.out.println("Нога Samsung сделала шаг"); }

    @Override
    public int getPrice() {
        return price;
    }
}
package npopov.Lab7.Robot.legs;

public class SamsungLeg implements ILeg {

    private int price = 8;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

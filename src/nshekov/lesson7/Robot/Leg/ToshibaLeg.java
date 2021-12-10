package nshekov.lesson7.Robot.Leg;

public class ToshibaLeg implements ILeg{
    private int price = 12;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void stepLeg() {
        System.out.println("Наступил на ногу фирмы Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

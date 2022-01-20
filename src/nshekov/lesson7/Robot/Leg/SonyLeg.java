package nshekov.lesson7.Robot.Leg;

public class SonyLeg implements ILeg{
    private int price = 5;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void stepLeg() {
        System.out.println("Наступил на ногу фирмы Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

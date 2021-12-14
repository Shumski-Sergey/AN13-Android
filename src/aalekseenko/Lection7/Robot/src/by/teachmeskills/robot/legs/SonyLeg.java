package aalekseenko.Lection7.Robot.src.by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {}

    @Override
    public void step() {
        System.out.println("Нога Sony ходит");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

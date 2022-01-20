package epavlyutin.pack7.robot.Leg;

public class SonyLeg implements ILeg {
    private int price = 5;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void stepLeg() {
        System.out.println("Нога от sony делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package epavlyutin.pack7.robot.Leg;

public class ToshibaLeg implements ILeg {
    private int price = 3;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void stepLeg() {
        System.out.println("Нога от toshiba делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

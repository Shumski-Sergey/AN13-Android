package lkovsher.Robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    public void step() {
        System.out.println("Делает шаг нога Toshiba");
    }

    public int getPrice() {
        return price;
    }
}

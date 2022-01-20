package vabramchuk.Lab7.Lab_Robot.legs;

public class ToshibaLeg implements ILeg{
    private int price = 4;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    @Override
    public void step() {
        System.out.println("Хромает на ноге Toshiba\n");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

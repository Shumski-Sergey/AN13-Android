package vikonnikova.lab7.Robot.legs;

public class ToshibaLeg implements ILeg {
    private int price = 30;

    public ToshibaLeg (int price) {
        this.price = price;
    }

    public ToshibaLeg () {
    }

    @Override
    public void step () {
        System.out.println("Нога от Samsung делает шаг");
    }

    @Override
    public int getPrice () {
        return price;
    }
}

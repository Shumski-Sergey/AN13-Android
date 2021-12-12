package vikonnikova.lab7.Robot.legs;

public class SonyLeg implements ILeg {
    private int price = 50;

    public SonyLeg (int price) {
        this.price = price;
    }

    public SonyLeg () {
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

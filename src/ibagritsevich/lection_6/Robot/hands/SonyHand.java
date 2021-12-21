package ibagritsevich.lection_6.Robot.hands;

public class SonyHand implements IHand {

    private int price = 250;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() { System.out.println("Рука Sony поднята вверх"); }

    @Override
    public int getPrice() {
        return price;
    }
}
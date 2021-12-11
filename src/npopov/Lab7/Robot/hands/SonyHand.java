package npopov.Lab7.Robot.hands;

public class SonyHand implements IHand {

    private int price = 6;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package vikonnikova.lab7.Robot.hands;

public class SonyHand implements IHand {
    private int price = 90;

    public SonyHand (int price) {
        this.price = price;
    }

    public SonyHand () {
    }

    @Override
    public void upHand() {
        System.out.println("Рука от Sony поднимается вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

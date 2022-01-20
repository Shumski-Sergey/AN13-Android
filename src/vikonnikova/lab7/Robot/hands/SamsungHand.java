package vikonnikova.lab7.Robot.hands;

public class SamsungHand implements IHand {
    private int price = 100;

    public SamsungHand (int price) {
        this.price = price;
    }

    public SamsungHand () {
    }

    @Override
    public void upHand() {
        System.out.println("Рука от Samsung поднимается вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

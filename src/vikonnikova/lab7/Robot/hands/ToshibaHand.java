package vikonnikova.lab7.Robot.hands;

public class ToshibaHand implements IHand {
    private int price = 80;

    public ToshibaHand (int price) {
        this.price = price;
    }

    public ToshibaHand () {
    }

    @Override
    public void upHand() {
        System.out.println("Рука от Toshiba поднимается вверх");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

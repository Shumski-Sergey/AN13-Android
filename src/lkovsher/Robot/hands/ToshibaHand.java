package lkovsher.Robot.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    public void upHand() {
        System.out.println("Поднимается рука Toshiba");
    }

    public int getPrice() {
        return price;
    }
}

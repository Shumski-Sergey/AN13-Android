package nshekov.lesson7.Robot.Hand;

public class ToshibaHand implements IHand{
    int price = 10;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

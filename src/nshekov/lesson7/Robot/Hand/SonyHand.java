package nshekov.lesson7.Robot.Hand;

public class SonyHand implements IHand{
    int price = 12;

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

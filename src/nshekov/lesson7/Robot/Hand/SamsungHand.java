package nshekov.lesson7.Robot.Hand;

public class SamsungHand implements IHand{
    private int price = 7;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

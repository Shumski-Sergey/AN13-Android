package ibagritsevich.lection_6.Robot.hands;

public class SamsungHand implements IHand {

    private int price = 220;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() { System.out.println("Рука Samsung поднята вверх"); }

    @Override
    public int getPrice() {
        return price;
    }
}
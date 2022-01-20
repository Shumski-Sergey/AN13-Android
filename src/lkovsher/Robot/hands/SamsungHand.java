package lkovsher.Robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    public void upHand() { System.out.println("Поднимается рука T рука Samsung");}

    public int getPrice() {
        return price;
    }
}

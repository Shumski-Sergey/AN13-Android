package vabramchuk.Lab7.Lab_Robot.hands;

public class SamsungHand implements IHand {
    private int price = 4;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    public void upHand() {
        System.out.println("Махнула рука Samsung");
    }

    public int getPrice() {
        return price;
    }
}

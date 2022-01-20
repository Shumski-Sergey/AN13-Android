package ryancharuk.LabSeven.HomeWorksRobot.heads;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony, моя цена = "+ price);
    }

    @Override
    public int getPrice() {
        return price;
    }
}

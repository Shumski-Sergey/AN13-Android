package ibagritsevich.lection_6.Robot.heads;

public class SonyHead implements IHead {

    private int price = 300;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void Speek() { System.out.println("Говорит голова Sony"); }

    @Override
    public int getPrice() {
        return price;
    }
}
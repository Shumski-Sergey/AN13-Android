package ibagritsevich.lection_6.Robot.heads;

public class ToshibaHead implements IHead {

    private int price =250;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void Speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
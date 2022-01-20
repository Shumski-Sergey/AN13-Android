package nshekov.lesson7.Robot.Head;

public class ToshibaHead implements IHead {
    private int price = 14;

    public ToshibaHead() {
    }

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

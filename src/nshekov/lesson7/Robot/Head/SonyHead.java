package nshekov.lesson7.Robot.Head;

public class SonyHead implements IHead {
    private int price = 8;

    public SonyHead() {
    }

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Голова Sony говорит");
    }

    @Override
    public int getPrise() {return price;}
}

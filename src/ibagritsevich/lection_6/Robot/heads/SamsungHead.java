package ibagritsevich.lection_6.Robot.heads;

public class SamsungHead implements IHead {

    private int price = 270;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void Speek() { System.out.println("Говорит голова Samsung"); }

    @Override
    public int getPrice() {
        return price;
    }
}
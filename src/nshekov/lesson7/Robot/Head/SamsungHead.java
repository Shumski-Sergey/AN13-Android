package nshekov.lesson7.Robot.Head;

public class SamsungHead implements IHead {
    private int price = 11;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrise() {
        return price;
    }
}

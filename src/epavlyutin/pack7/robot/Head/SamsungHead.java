package epavlyutin.pack7.robot.Head;

public class SamsungHead implements IHead {
    private int price = 21;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова samsung");
    }
}

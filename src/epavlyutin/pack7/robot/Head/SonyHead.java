package epavlyutin.pack7.robot.Head;

public class SonyHead implements IHead{
    private int price = 25;

    public SonyHead(int price) {
        this.price = price;
    }
    public SonyHead(){
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void speak() {
        System.out.println("Голова sony говорит");
    }
}

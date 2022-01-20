package epavlyutin.pack7.robot.Head;

public class ToshibaHead implements IHead{
    private int price = 20;

    public ToshibaHead(int price) {
        this.price = price;
    }
    public ToshibaHead(){
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void speak() {
        System.out.println("Голова toshiba говорит");
    }
}

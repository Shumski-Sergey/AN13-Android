package vikonnikova.lab7.Robot.heads;

public class ToshibaHead implements IHead{
    private int price = 150;

    public ToshibaHead (int price) {
        this.price = price;
    }

    public ToshibaHead () {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

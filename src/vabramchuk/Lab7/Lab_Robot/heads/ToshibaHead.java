package vabramchuk.Lab7.Lab_Robot.heads;

public class ToshibaHead implements IHead{
    private int price = 5;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {

    }

    @Override
    public void speek() {
        System.out.println("Молвила голова Toshiba ");

    }

    @Override
    public int getPrice() {
        return 0;
    }
}

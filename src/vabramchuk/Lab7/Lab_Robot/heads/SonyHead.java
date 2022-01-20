package vabramchuk.Lab7.Lab_Robot.heads;

public class SonyHead implements IHead {
    private int price = 8;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {

    }

    @Override
    public void speek() {
        System.out.println("Разговаривает голова Sony ");

    }

    @Override
    public int getPrice() {
        return 0;
    }
}

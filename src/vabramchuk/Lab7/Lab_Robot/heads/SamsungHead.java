package vabramchuk.Lab7.Lab_Robot.heads;

public class SamsungHead implements IHead{
    private int price = 6;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    public int getPrice() {
        return price;
    }
}

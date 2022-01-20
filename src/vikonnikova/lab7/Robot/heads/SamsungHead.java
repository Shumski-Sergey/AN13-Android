package vikonnikova.lab7.Robot.heads;

public class SamsungHead implements IHead {
    private int price = 250;

    public SamsungHead (int price) {
        this.price = price;
    }

    public SamsungHead () {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

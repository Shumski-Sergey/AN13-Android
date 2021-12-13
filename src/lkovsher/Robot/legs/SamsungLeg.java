package lkovsher.Robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    public void step() { System.out.println("Делает шаг нога Samsung");}

    public int getPrice() {
        return price;
    }
}

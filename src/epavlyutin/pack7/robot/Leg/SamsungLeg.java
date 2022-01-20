package epavlyutin.pack7.robot.Leg;

public class SamsungLeg implements ILeg {
    private int price = 7;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void stepLeg() {
        System.out.println("Нога от samsung делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

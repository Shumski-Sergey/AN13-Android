package nshekov.lesson7.Robot.Leg;

public class SumsungLeg implements ILeg{
    private int price = 9;

    public SumsungLeg(int price) {
        this.price = price;
    }

    public SumsungLeg() {
    }

    @Override
    public void stepLeg() {
        System.out.println("Наступил на ногу фирмы Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

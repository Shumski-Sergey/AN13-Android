package vikonnikova.lab7.Robot.legs;

public class SamsungLeg implements ILeg {
    private int price = 60;

    public SamsungLeg (int price) {
        this.price = price;
    }

    public SamsungLeg () {
    }

    @Override
    public void step () {
        System.out.println("Нога от Samsung делает шаг");
    }

    @Override
    public int getPrice () {
        return price;
    }
}

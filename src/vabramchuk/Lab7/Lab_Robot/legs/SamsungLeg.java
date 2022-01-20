package vabramchuk.Lab7.Lab_Robot.legs;

public class SamsungLeg implements ILeg{
    private int price = 3;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {

    }

    @Override
    public void step() {
        System.out.println("Ударил ногой Samsung \n");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

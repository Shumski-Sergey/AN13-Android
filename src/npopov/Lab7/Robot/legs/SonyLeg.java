package npopov.Lab7.Robot.legs;

public class SonyLeg implements ILeg{

    private int price = 8;

    public SonyLeg(int price){
        this.price = price;
    }

    public SonyLeg(){
    }

    @Override
    public void step() {
        System.out.println("Нога Sony делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

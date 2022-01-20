package npopov.Lab7.Robot.legs;

public class ToshibaLeg implements ILeg{

    private int price = 7;

    public ToshibaLeg(int price){
        this.price = price;
    }

    public ToshibaLeg(){
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package vabramchuk.Lab7.Lab_Robot.hands;

public class ToshibaHand implements IHand {
    private int price = 9;

    public ToshibaHand(int price) {
        this.price = price;
    }
    public ToshibaHand(){

    }
    public void upHand(){
        System.out.println("Большая рука Toshiba ");
    }

    public int getPrice() {
        return price;
    }
}

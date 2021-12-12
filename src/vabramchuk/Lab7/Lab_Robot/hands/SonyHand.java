package vabramchuk.Lab7.Lab_Robot.hands;

public class SonyHand implements IHand{
    private int price = 7;

    public SonyHand(int price) {
        this.price = price;
    }
    public SonyHand(){
    }
    public void upHand(){
        System.out.println("Замахнулась рука Sony ");
    }

    public int getPrice() {
        return price;
    }
}

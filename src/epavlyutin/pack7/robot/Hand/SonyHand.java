package epavlyutin.pack7.robot.Hand;

public class SonyHand implements IHand {
    private int price = 7;

    public SonyHand(int price) {
        this.price = price;
    }
    public SonyHand (){
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднята");
    }
}

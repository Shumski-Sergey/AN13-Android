package epavlyutin.pack7.robot.Hand;

public class ToshibaHand implements IHand {
    private int price = 10;

    public ToshibaHand(int price) {
        this.price = price;
    }
    public ToshibaHand (){
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba  поднята");
    }
}

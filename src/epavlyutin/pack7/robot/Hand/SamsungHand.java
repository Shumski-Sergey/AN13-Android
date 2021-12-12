package epavlyutin.pack7.robot.Hand;

public class SamsungHand implements IHand {
    private int price = 15;

    public SamsungHand(int price) {
        this.price = price;
    }
    public SamsungHand(){
    }


    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void upHand() {
        System.out.println("Рука samsung поднята");
    }
}

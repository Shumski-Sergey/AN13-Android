package lkovsher.Human.Jacket;

public class NikeJacket implements IJacket{
    private int price;

    public NikeJacket(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void putOnJacket(){
        System.out.println("Куртка Nike надета.");
    }
    public void takeOffJacket(){
        System.out.println("Куртка Nike снята.");
    }
}

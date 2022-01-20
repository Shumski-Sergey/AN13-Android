package lkovsher.Human.Jacket;

public class PumaJacket implements IJacket {
    private int price;

    public PumaJacket(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void putOnJacket(){
        System.out.println("Куртка Puma надета.");
    }
    public void takeOffJacket(){
        System.out.println("Куртка Puma снята.");
    }
}

package lkovsher.Human.Shoes;

public class PumaShoes implements IShoes{
    private int price;

    public int getPrice() {
        return price;
    }

    public PumaShoes(int price) {
        this.price = price;
    }

    public void putOnShoes(){
        System.out.println("Обувь Puma надета.");
    }
    public void takeOffShoes(){
        System.out.println("Обувь Puma снята.");
    }
}

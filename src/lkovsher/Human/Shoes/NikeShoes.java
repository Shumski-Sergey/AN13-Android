package lkovsher.Human.Shoes;

public class NikeShoes implements IShoes {
    private int price;

    public NikeShoes(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void putOnShoes(){
        System.out.println("Обувь Nike надета.");
    }
    public void takeOffShoes(){
        System.out.println("Обувь Nike снята.");
    }
}

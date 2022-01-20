package lkovsher.Human.Shoes;

public class ReebokShoes implements IShoes {
    private int price;

    public int getPrice() {
        return price;
    }

    public ReebokShoes(int price) {
        this.price = price;
    }

    public void putOnShoes(){
        System.out.println("Обувь Reebok надета.");
    }
    public void takeOffShoes(){
        System.out.println("Обувь Reebok снята.");
    }
}

package lkovsher.Human.Jacket;

public class ReebokJacket implements IJacket {
    private int price;

    public ReebokJacket(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void putOnJacket(){
        System.out.println("Куртка Reebok надета.");
    }
    public void takeOffJacket(){
        System.out.println("Куртка ReebokJ снята.");
    }
}

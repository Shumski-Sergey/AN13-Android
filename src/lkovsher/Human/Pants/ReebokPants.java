package lkovsher.Human.Pants;

public class ReebokPants implements IPants {
    private int price;

    public ReebokPants(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void putOnPants(){
        System.out.println("Штаны Reebok надеты.");
    }
    public void takeOffPants(){
        System.out.println("Штаны Reebok сняты.");
    }
}

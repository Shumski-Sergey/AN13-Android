package lkovsher.Human.Pants;

public class NikePants implements IPants {
    private int price;

    public NikePants(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void putOnPants(){
        System.out.println("Штаны Nike надеты.");
    }
    public void takeOffPants(){
        System.out.println("Штаны Nike сняты.");
    }
}

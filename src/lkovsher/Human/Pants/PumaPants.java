package lkovsher.Human.Pants;

public class PumaPants implements IPants {
    private int price;

    public PumaPants(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void putOnPants(){
        System.out.println("Штаны Puma надеты.");
    }
    public void takeOffPants(){
        System.out.println("Штаны Puma сняты.");
    }
}

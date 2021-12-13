package lkovsher.Human;

import lkovsher.Human.Jacket.IJacket;
import lkovsher.Human.Pants.IPants;
import lkovsher.Human.Shoes.IShoes;

public class Human implements IHuman{
    String name;
    private IJacket Jacket;
    private IPants Pants;
    private IShoes Shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        Jacket = jacket;
        Pants = pants;
        Shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public IJacket getJacket() {
        return Jacket;
    }

    public IPants getPants() {
        return Pants;
    }

    public IShoes getShoes() {
        return Shoes;
    }

    public void removeClothing() {
        System.out.println("\n");
        System.out.println(this.getName());
        Jacket.takeOffJacket();
        Shoes.takeOffShoes();
        Pants.takeOffPants();
    }

    public void putOnClothing() {
        System.out.println("\n");
        System.out.println(this.getName());
        Jacket.putOnJacket();
        Shoes.putOnShoes();
        Pants.putOnPants();
    }

    public int priceOfClothing(){
        int price = Jacket.getPrice() + Shoes.getPrice() + Pants.getPrice();
        System.out.println("Стоимость всей одежды:" + price);
        return price;
    }

}

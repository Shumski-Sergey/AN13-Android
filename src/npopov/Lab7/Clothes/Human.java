package npopov.Lab7.Clothes;

import npopov.Lab7.Clothes.Jacket.IJacket;
import npopov.Lab7.Clothes.Pants.IPants;
import npopov.Lab7.Clothes.Shoes.IShoes;

public class Human implements IHuman {

    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    @Override
    public void dressedAll() {
        System.out.println(getName().concat(":"));
        jacket.dressedJacket();
        pants.dressedPants();
        shoes.dressedShoes();
    }

    @Override
    public void undressAll() {
        System.out.println(getName().concat(":"));
        jacket.undressJacket();
        pants.undressPants();
        shoes.undressShoes();
    }

    @Override
    public int getPriceClothes() {
        return jacket.getPriceJacket() + pants.getPricePants() + shoes.getPriceShoes();
    }

    public void outPutPrice() {
        System.out.println("Одежда стоит " + getPriceClothes() + " рублей\n");
    }

    public String getName() {
        return name;
    }

    public IPants getPants() {
        return pants;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }
}

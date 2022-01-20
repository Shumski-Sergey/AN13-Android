package ibagritsevich.lection_6.Clothes;

import ibagritsevich.lection_6.Clothes.Jacket.IJacket;
import ibagritsevich.lection_6.Clothes.Pants.IPants;
import ibagritsevich.lection_6.Clothes.Shoes.IShoes;

public class Human implements IHuman {

    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;
    private String name;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human(){}

    public String getName() {return name;}

    public IJacket getJacket() { return jacket;}

    public void setJacket(IJacket jacket) {this.jacket = jacket;}

    public IPants getPants() { return pants;}

    public void setPants(IPants pants) {this.pants = pants;}

    public IShoes getShoes() { return shoes;}

    public void setShoes(IShoes shoes) {this.shoes = shoes;}

    @Override
    public void GetDressed() {
        System.out.println("\n" + getName());
        jacket.PutOn();
        pants.PutOn();
        shoes.PutOn();
    }

    @Override
    public void Undress() {
        System.out.println("\n" + getName());
        jacket.TakeOff();
        pants.TakeOff();
        shoes.TakeOff();
    }
}

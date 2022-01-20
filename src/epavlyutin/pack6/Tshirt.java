package epavlyutin.pack6;

public class Tshirt extends Clothes implements Sellable,Discountable{
    public Tshirt(String name) {
        super(name);
    }

    @Override
    public void discont() {
        System.out.println(name + " покупается со скидкой");

    }

    @Override
    public void sell() {
        System.out.println(name + " продаётся подроже");

    }
}

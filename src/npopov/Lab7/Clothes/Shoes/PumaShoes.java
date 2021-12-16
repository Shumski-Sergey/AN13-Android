package npopov.Lab7.Clothes.Shoes;

public class PumaShoes implements IShoes{

    private int price = 200;

    public PumaShoes(){
    }

    @Override
    public void dressedShoes() {
        System.out.println("Надел кроссовки Puma");
    }

    @Override
    public void undressShoes() {
        System.out.println("Снял кроссовки Puma");
    }

    @Override
    public int getPriceShoes() {
        return price;
    }
}

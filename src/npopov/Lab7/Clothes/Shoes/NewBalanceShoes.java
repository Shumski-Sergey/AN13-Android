package npopov.Lab7.Clothes.Shoes;

public class NewBalanceShoes implements IShoes{

    private int price = 300;

    public NewBalanceShoes(){
    }

    @Override
    public void dressedShoes() {
        System.out.println("Надел кроссовки New Balance");
    }

    @Override
    public void undressShoes() {
        System.out.println("Снял кроссовки New Balance");
    }

    @Override
    public int getPriceShoes() {
        return price;
    }
}

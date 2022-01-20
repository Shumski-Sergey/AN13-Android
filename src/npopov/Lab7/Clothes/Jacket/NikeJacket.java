package npopov.Lab7.Clothes.Jacket;

public class NikeJacket implements IJacket {

    private int price = 300;

    public NikeJacket() {
    }

    @Override
    public void dressedJacket() {
        System.out.println("Надел куртку Nike");
    }

    @Override
    public void undressJacket() {
        System.out.println("Снял куртку Nike");
    }

    @Override
    public int getPriceJacket() {
        return price;
    }
}

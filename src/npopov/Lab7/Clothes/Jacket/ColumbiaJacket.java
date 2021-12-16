package npopov.Lab7.Clothes.Jacket;

public class ColumbiaJacket implements IJacket {

    private int price = 400;

    public ColumbiaJacket() {
    }

    @Override
    public void dressedJacket() {
        System.out.println("Надел куртку Columbia");
    }

    @Override
    public void undressJacket() {
        System.out.println("Снял куртку Columbia");
    }

    @Override
    public int getPriceJacket() {
        return price;
    }
}

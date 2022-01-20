package npopov.Lab7.Clothes.Pants;

public class AdidasPants implements IPants {

    private int price = 100;

    public AdidasPants() {
    }

    @Override
    public void dressedPants() {
        System.out.println("Надел штаны Adidas");
    }

    @Override
    public void undressPants() {
        System.out.println("Снял штаны Adidas");
    }

    @Override
    public int getPricePants() {
        return price;
    }
}

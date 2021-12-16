package npopov.Lab7.Clothes.Pants;

public class QuiksilverPants implements IPants{

    private int price = 80;

    public QuiksilverPants(){
    }

    @Override
    public void dressedPants() {
        System.out.println("Надел штаны Quiksilver");
    }

    @Override
    public void undressPants() {
        System.out.println("Снял штаны Quiksilver");
    }

    @Override
    public int getPricePants() {
        return price;
    }
}

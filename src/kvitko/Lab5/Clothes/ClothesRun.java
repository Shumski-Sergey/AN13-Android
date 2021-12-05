package kvitko.Lab5.Clothes;

public class ClothesRun {
    public static void main(String[] args) {
        Clothes item = new Clothes(50,60,70,20);
        item.wear();
        item.sell();
        item.buy();
    }
}

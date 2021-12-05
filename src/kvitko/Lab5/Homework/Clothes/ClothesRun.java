package kvitko.Lab5.Homework.Clothes;

import kvitko.Lab5.Homework.Clothes.Clothes;

public class ClothesRun {
    public static void main(String[] args) {
        Clothes item = new Clothes(50,60,70,20);
        item.wear();
        item.sell();
        item.buy();
    }
}

package npopov.Lab6.ClothesLab6;

import static java.lang.System.out;

public class Clothes implements Sellable, Discountable, Movable {

    @Override
    public void Sell() { out.println("Вы можете купить одежду"); }

    @Override
    public void Discount() {
        out.println("У Вас есть скидка на одежду");
    }

    @Override
    public void Mov() {
        out.println("Эту одежду можно носить");
    }
}

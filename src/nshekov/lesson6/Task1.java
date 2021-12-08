package nshekov.lesson6;

public class Task1{

    public static void main (String args[]) {
        Clothes shoes = new Clothes("Туфли");
        shoes.moveOn(shoes.getClothe());
        shoes.moveOf(shoes.getClothe());
        Clothes blouse = new Clothes("Кофта");
        blouse.buy(blouse.getClothe());
        blouse.sell(blouse.getClothe());
        Clothes socks = new Clothes("Носки");
        socks.discount(0);
        socks.discount(15);
        socks.discount(101);
        socks.discount(100);
    }
}

interface Movable{
    default void moveOn(String clothe){
        System.out.println(clothe + " надет(а/о/ы)");
    }
    default void moveOf(String clothe) {
        System.out.println(clothe + " снят(а/о/ы)");
    }
}

interface Sellable{
    default void buy(String clothe){
        System.out.println(clothe + " куплен(а/о/ы)");
    }
    default void sell(String clothe){
        System.out.println(clothe + " продан(а/о/ы)");
    }
}

interface Discountable{
    void discount(int x);
}
class Clothes implements Movable, Sellable, Discountable {
    private String clothe;

    public Clothes(String clothe) {
        this.clothe = clothe;
    }

    public String getClothe() {return this.clothe;}

    @Override
    public void discount(int discount) {
        if (discount == 0) System.out.println(this.getClothe() + " продаётся без скидки");
        else if (discount > 0 && discount < 100) System.out.println(this.getClothe() + " продаётся со скидкой " + discount);
        else if (discount == 100) System.out.println("Даром за амбаром");
        else System.out.println("Ты не умеешь торговаться");
    }

}
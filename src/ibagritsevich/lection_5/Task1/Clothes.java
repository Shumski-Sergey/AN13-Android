package ibagritsevich.lection_5.Task1;

public class Clothes implements Movable, Discountable, Sellable {

    private String type;

    public Clothes(String type) {
        this.type = type;
    }
    public String getType(){return type;}

    public void robe() {
        System.out.println("надеть " + getType());
    }

    public void sell() {
        System.out.println("продать " + getType());
    }

    public void discount() {
        System.out.println("продать со скидкой " + getType());
    }
}

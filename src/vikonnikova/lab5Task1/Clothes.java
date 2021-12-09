package vikonnikova.lab5Task1;

public class Clothes implements Discountable, Movable, Sellable {
    private String name;

    public Clothes (String name) {
        this.name = name;
    }
    public String getName() { return name; }

    @Override
    public void putOn () {

        System.out.println(name + " надеты");
    }
    @Override
    public void sell() {

        System.out.println(name + " продан");
    }
    @Override
    public void discount () {
        System.out.println(name + " куплено со скидкой");
    }
}

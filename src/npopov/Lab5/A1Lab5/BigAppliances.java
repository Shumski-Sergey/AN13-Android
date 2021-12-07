package npopov.Lab5.A1Lab5;

public class BigAppliances extends Appliances {

    private int weight;

    BigAppliances(String name, double price, int year, int weight) {
        super(name, price, year);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Фирма: ".concat(getName()) + " " + "Цена: " + getPrice() + " "
                + "Год выпуска: " + getYear() + " " + "Вес: " + getWeight());
    }
}

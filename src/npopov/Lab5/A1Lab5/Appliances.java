package npopov.Lab5.A1Lab5;

public class Appliances {

    private String name;
    private double price;
    private int year;

    Appliances(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void rosette() {
        System.out.println("Прибор включён в розетку!");
    }

    public void print() {
        System.out.println("Фирма: ".concat(name) + " " + "Цена: " + price + " " + "Год выпуска: " + year);
    }
}
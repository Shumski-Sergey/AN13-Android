package npopov.Lab5.A1Lab5;

public class Blender extends LittleAppliances {

    private String color;

    Blender(String name, double price, int year, String color) {
        super(name, price, year);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void print() {
        System.out.println("Фирма: ".concat(getName()) + " " + "Цена: " + getPrice() + " "
                + "Год выпуска: " + getYear() + " " + "Цвет: ".concat(getColor()));
    }
}

package vikonnikova.lab5TaskA1;

public class KitchenTech extends Tech {
    String brandName;

    public KitchenTech(String size, boolean turnedOn, String brandName) {
        super(size, turnedOn);
        this.brandName = brandName;
    }
    public String getBrandName() { return brandName; }

    public void displayInfo() {
        System.out.println("Размер техники: " + getSize() + " " + "имя бренда: " + getBrandName());
    }
}


package ibagritsevich.lection_5.TaskA1;

public class Household_appliances {

    private String type;
    private String brand;
    private int weight;
    private int length;
    private int width;

    public Household_appliances(String type, String brand, int weight, int length, int width) {
        this.type = type;
        this.brand = brand;
        this.weight = weight;
        this.length = length;
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void displayInfo() {
    }

    public void turnOnOff(int flag) {
        if (flag == 1) {
            System.out.println("\nУстройство включено:\t" + getBrand());
        } else if (flag == 0) {
            System.out.println("\nУстройство отключено:\t" + getBrand());
        }
    }
}

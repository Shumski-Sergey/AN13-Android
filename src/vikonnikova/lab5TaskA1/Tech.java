package vikonnikova.lab5TaskA1;

public class Tech {
    private String size;
    private boolean turnedOn;

    public Tech(String size, boolean turnedOn) {
        this.size = size;
        this.turnedOn = turnedOn;
    }

    public String getSize() { return size; }
    public boolean isTurnedOn() { return turnedOn; }

    public void works () {
        if (isTurnedOn()) {
            System.out.println("Прибор включен в розетку");
        }
        else {
            System.out.println("Прибор не включен в розетку");
        }
    }
    public void displayInfo() {
        System.out.println("Размер техники: " + getSize());
    }
}


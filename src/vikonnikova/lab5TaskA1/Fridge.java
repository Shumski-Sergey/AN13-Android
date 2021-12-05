package vikonnikova.lab5TaskA1;

public class Fridge extends KitchenTech {
    public Fridge(String size, boolean turnedOn, String brandName) {
        super(size, turnedOn, brandName);
    }

    @Override
    public void works() {
        if (isTurnedOn()) {
            System.out.println("Прибор включен в розетку");
        } else {
            System.out.println("Прибор не включен в розетку");
        }
    }
}

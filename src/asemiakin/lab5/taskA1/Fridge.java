package asemiakin.lab5.taskA1;

public class Fridge extends LargeAppliances{
    int freezingCapacity;

    protected Fridge(String name, int volume, int electricityConsumption, int freezingCapacity) {
        super(name, volume, electricityConsumption);
        this.freezingCapacity = freezingCapacity;
    }

    protected int getFreezingCapacity() {
        return freezingCapacity;
    }

    @Override
    protected void displayInformationAbout(){
        super.displayInformationAbout();
        System.out.println("Мощность замораживания - " + getFreezingCapacity());
    }
}

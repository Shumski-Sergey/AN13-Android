package asemiakin.lab5.taskA1;

public class Dishwasher extends BuiltInAppliances{
    int waterConsumptionPerCycle;

    protected Dishwasher(String name, int volume, int electricityConsumption, int waterConsumptionPerCycle) {
        super(name, volume, electricityConsumption);
        this.waterConsumptionPerCycle = waterConsumptionPerCycle;
    }

    protected int getWaterConsumptionPerCycle() {
        return waterConsumptionPerCycle;
    }

    @Override
    protected void displayInformationAbout(){
        super.displayInformationAbout();
        System.out.println("Расход воды за цикл - " + getWaterConsumptionPerCycle());
    }
}

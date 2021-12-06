package asemiakin.lab5.taskA1;

public abstract class HouseholdAppliances {
    String name;
    int volume;
    int electricityConsumption;
    boolean enabledOrNot = false;

    protected HouseholdAppliances(String name, int volume, int electricityConsumption) {
        this.name = name;
        this.volume = volume;
        this.electricityConsumption = electricityConsumption;
    }

    protected String getName() {
        return name;
    }

    protected int getVolume() {
        return volume;
    }

    protected int getElectricityConsumption() {
        return electricityConsumption;
    }

    protected boolean isEnabledOrNot() {
        return enabledOrNot;
    }

    protected void plugIn(){
        if (isEnabledOrNot()) System.out.println('\n' + "Ошибка! " + getName() + " уже подключен в розетку.");
        else {
            System.out.println('\n' + getName() + " подключен в розетку.");
            enabledOrNot = true;
        }
    }

    protected void displayInformationAbout(){
        System.out.println('\n' + "Информация по объекту:");
        System.out.println("Имя - " + getName());
        System.out.println("Объём - " + getVolume());
        System.out.println("Энергопотребление - " + getElectricityConsumption());
        System.out.println("Включен в розетку? " + isEnabledOrNot());
    }
}

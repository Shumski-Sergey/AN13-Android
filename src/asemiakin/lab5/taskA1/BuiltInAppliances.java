package asemiakin.lab5.taskA1;

//Встраиваемая техника
public abstract class BuiltInAppliances extends HouseholdAppliances {
    protected BuiltInAppliances(String name, int volume, int electricityConsumption) {
        super(name, volume, electricityConsumption);
    }

    protected void mount() {
        System.out.println(name + " вмонтирована!");
    }
}

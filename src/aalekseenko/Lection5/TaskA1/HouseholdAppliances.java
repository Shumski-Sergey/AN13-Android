package aalekseenko.Lection5.TaskA1;

public class HouseholdAppliances {
    public String sizeTech;
    public String conditions;
    public boolean plugOnOff;

    public HouseholdAppliances(String sizeTech, String conditions, boolean plugOnOff) {
           this.sizeTech = sizeTech;
           this.conditions = conditions;
           this.plugOnOff = plugOnOff;
    }

    public String getSizeTech() {return sizeTech;}

    public String getConditions() {return conditions;}

    public boolean isPlugOnOff() {return plugOnOff;}

    public void displayInfo(){
        System.out.println("Описание техники: размер - " + getSizeTech() + " состояние - " + getConditions() + " включен в розетку - " + isPlugOnOff() + "\n");
    }
}

package aalekseenko.Lection5.TaskA1;

public class FloorMop extends Cleaning{
    public String companyManufacturer;

    public FloorMop(String sizeTech, String conditions, boolean plugOnOff, String manualOrAutomatic, String companyManufacturer) {
        super(sizeTech, conditions, plugOnOff, manualOrAutomatic);
        this.companyManufacturer = companyManufacturer;
    }

    public String getCompanyManufacturer() { return companyManufacturer; }

    public void displayInfo(){
        System.out.println("Описание швабры: размер - " + getSizeTech() + " состояние - " + getConditions() + " включен в розетку - " + isPlugOnOff()
                + " ручная или автоматическая техника - " + manualOrAutomatic + " компания производитель - " + companyManufacturer + "\n");
    }
}

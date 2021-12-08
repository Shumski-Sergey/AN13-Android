package aalekseenko.Lection5.TaskA1;

public class PancakeMaker extends CookingFood{
    public String companyManufacturer;

    public PancakeMaker(String sizeTech, String conditions, boolean plugOnOff, String companyManufacturer) {
        super(sizeTech, conditions, plugOnOff);
        this.companyManufacturer = companyManufacturer;
    }

    public String getCompanyManufacturer() { return conditions; }

    public void displayInfo(){
        System.out.println("Описание изготовителя блинов: размер - " + getSizeTech() + " состояние - " + getConditions() + " включен в розетку - " + isPlugOnOff()
                + " компания производитель - " + companyManufacturer + "\n");
    }
}

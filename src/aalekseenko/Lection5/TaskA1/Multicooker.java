package aalekseenko.Lection5.TaskA1;

public class Multicooker extends CookingFood{
    public String companyManufacturer;

    public Multicooker(String sizeTech, String conditions, boolean plugOnOff, String companyManufacturer) {
        super(sizeTech, conditions, plugOnOff);
        this.companyManufacturer = companyManufacturer;
    }

    public String getCompanyManufacturer() { return companyManufacturer; }

    public void displayInfo(){
        System.out.println("Описание мультиварки: размер - " + getSizeTech() + " состояние - " + getConditions() + " включен в розетку - " + isPlugOnOff()
                 + " компания производитель - " + companyManufacturer + "\n");
    }
}

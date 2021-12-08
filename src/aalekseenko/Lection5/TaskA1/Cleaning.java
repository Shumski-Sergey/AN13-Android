package aalekseenko.Lection5.TaskA1;

import java.util.Objects;

public class Cleaning extends HouseholdAppliances{
    public String manualOrAutomatic;

    public Cleaning(String sizeTech, String conditions, boolean plugOnOff, String manualOrAutomatic) {
        super(sizeTech, conditions, plugOnOff);
        this.manualOrAutomatic = manualOrAutomatic;
    }

    public String getManualOrAutomatic() { return manualOrAutomatic; }

    public void wayOfWorking(){
        if (Objects.equals(manualOrAutomatic, "Manual")){System.out.println("Manual cleaning tech");}
        else if (Objects.equals(manualOrAutomatic, "Automatic")) {System.out.println("Automatic cleaning tech");}
        else System.out.println("Некорректный ввод, в параметры моющей техники необходимо вводить Manual или Automatic");
        }
    public void displayInfo(){
        System.out.println("Описание моющей техники: размер - " + getSizeTech() + " состояние - " + getConditions() + " включен в розетку - " + isPlugOnOff()
        + " ручная или автоматическая техника - " + manualOrAutomatic + "\n");
    }
    }

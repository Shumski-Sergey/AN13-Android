package ibagritsevich.lection_5.TaskA1;

import ibagritsevich.lection_5.TaskA1.BathEquipment.Bath;
import ibagritsevich.lection_5.TaskA1.BathEquipment.Bath_equipment;
import ibagritsevich.lection_5.TaskA1.ClimateEquipment.Climate_equipment;
import ibagritsevich.lection_5.TaskA1.ClimateEquipment.Conditioner;
import ibagritsevich.lection_5.TaskA1.KitchenEquipment.Fridge;
import ibagritsevich.lection_5.TaskA1.KitchenEquipment.Kitchen_equipment;

public class TurnOn {
    public static void main(String[] args) {
        Bath_equipment bath = new Bath("Техника для ванны", "BLB", 45, 150, 75);
        bath.displayInfo();
        Kitchen_equipment fridge = new Fridge("Техника для кухни","Samsung",13,49,30,250);
        fridge.displayInfo();
        Climate_equipment conditioner = new Conditioner("Климатическое оборудование","Scarlett",1,20,20, 150);
        conditioner.displayInfo();
        bath.turnOnOff(0);
        fridge.turnOnOff(1);
        conditioner.turnOnOff(1);
    }
}


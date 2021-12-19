package ibagritsevich.lection_5.TaskA1.BathEquipment;

import ibagritsevich.lection_5.TaskA1.Household_appliances;

public class Bath_equipment extends Household_appliances {
    public Bath_equipment(String type, String brand, int weight, int length, int width) {
        super(type, brand, weight, length, width);
    }

    public void displayInfo(){
        System.out.println("\nТип: " + this.getType() + "\nБрэнд: " + this.getBrand() + "\nВес,кг: " + this.getWeight() + "\nДлина,см: " + this.getLength() + "\nШирина,см: " + this.getWidth());
    }
}

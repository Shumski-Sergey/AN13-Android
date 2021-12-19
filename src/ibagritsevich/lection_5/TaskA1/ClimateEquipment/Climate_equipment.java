package ibagritsevich.lection_5.TaskA1.ClimateEquipment;

import ibagritsevich.lection_5.TaskA1.Household_appliances;

public class Climate_equipment extends Household_appliances {

    int diameter;

    public Climate_equipment(String type, String brand, int weight, int length, int width, int diameter) {
        super(type, brand, weight, length, width);
        this.diameter = diameter;
    }

    public int getDiameter() {return diameter;}

    public void displayInfo(){
        System.out.println("\nТип: " + this.getType() + "\nБрэнд: " + this.getBrand() + "\nВес,кг: " + this.getWeight() + "\nДлина,см: " + this.getLength() + "\nШирина,см: " + this.getWidth() + "\nДиаметр,мм: " + getDiameter());
    }
}
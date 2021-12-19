package ibagritsevich.lection_5.TaskA1.KitchenEquipment;

import ibagritsevich.lection_5.TaskA1.Household_appliances;

public class Kitchen_equipment extends Household_appliances {

    int capacity;

    public Kitchen_equipment(String type, String brand, int weight, int length, int width, int capacity) {
        super(type, brand, weight, length, width);
        this.capacity = capacity;
    }

    public int getCapacity() {return capacity;}

    public void displayInfo(){
        System.out.println("\nТип: " + this.getType() + "\nБрэнд: " + this.getBrand() + "\nВес,кг: " + this.getWeight() + "\nДлина,см: " + this.getLength() + "\nШирина,см: " + this.getWidth() + "\nМощность,Вт: " + getCapacity());
    }
}
package asemiakin.lab5.taskA1;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Атлант", 419, 345, 15);
        Fridge fridge1 = new Fridge("Bosh", 354, 289, 10);
        Dishwasher dishwasher = new Dishwasher("Samsung", 200, 77, 9);
        fridge.displayInformationAbout();
        dishwasher.displayInformationAbout();
        fridge1.displayInformationAbout();
        fridge.plugIn();
        dishwasher.plugIn();
    }
}

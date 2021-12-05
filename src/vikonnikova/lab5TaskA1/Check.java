package vikonnikova.lab5TaskA1;


import java.util.concurrent.Callable;

public class Check {
    public static void main(String[] args) {
        KitchenTech CoffeeMaker = new CofeeMaker ("small", false, "Philips");
        KitchenTech Fridge = new Fridge ("large", true, "Atlant");
        CleaningTech VacuumCleaner = new VacuumCleaner ("small", false, "Xiaomi");

        CoffeeMaker.works();
        CoffeeMaker.displayInfo();

        Fridge.works();
        Fridge.displayInfo();

        VacuumCleaner.works();
        VacuumCleaner.displayInfo();
        }
    }

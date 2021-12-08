package aalekseenko.Lection5.TaskA1;
/*
A1.Создать иерархию классов, описывающих бытовую технику. Создать
несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */
public class Runner {
    public static void main(String[] args) {
Cleaning rag = new FloorMop("big", "used", false, "Manual", "Rag");
VacuumCleaner cleaner = new VacuumCleaner("big", "new", true, "Automatic", "Rag");
CookingFood cooker = new CookingFood("medium", "new", true);
CookingFood pancake = new PancakeMaker("small", "new", false,"Rag");

System.out.println(rag.getConditions());
System.out.println(cleaner.plugOnOff);
System.out.println(cooker.getSizeTech());
System.out.println(pancake.getSizeTech());

rag.displayInfo();
cleaner.displayInfo();
cooker.displayInfo();
pancake.displayInfo();
    }
}

package mshpudeyko.Practice4.Tsk3;
/*
* .Создать иерархию классов, описывающих бытовую технику. Создать
несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
* */
public class Main {
    public static void main(String[] args) {
        ForCooking fridge=new Fridge(10,"Atlant",true,"Storage of food");
        ForCooking microwave=new Microwave(15,"Samsung",true,"Warm of food");
        ForCooking toaster=new Toaster(5,"HP",true,"Fry food");
        ForEducation desktop=new Desktop(100,"Mac",false,"16");
        ForEducation pad=new Pad(60,"Xiaomi",false,"10");
        ForEducation laptop=new Laptop(90,"Asus",false,"13");

        fridge.print();
        microwave.print();
        toaster.print();
        desktop.print();
        pad.print();
        laptop.print();
    }
}

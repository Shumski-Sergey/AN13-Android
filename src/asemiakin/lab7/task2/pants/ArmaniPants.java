package asemiakin.lab7.task2.pants;

public class ArmaniPants implements Pants{

    @Override
    public void putOn() {
        System.out.println("Надеты штаны от Armani");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны от Armani");
    }
}

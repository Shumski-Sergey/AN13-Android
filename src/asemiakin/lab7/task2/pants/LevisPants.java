package asemiakin.lab7.task2.pants;

public class LevisPants implements Pants {

    @Override
    public void putOn() {
        System.out.println("Надеты штаны от Levi's");
    }

    @Override
    public void takeOff() {
        System.out.println("Сняты штаны от Levi's");
    }
}

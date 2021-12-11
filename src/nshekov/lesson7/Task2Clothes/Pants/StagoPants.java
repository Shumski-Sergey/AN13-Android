package nshekov.lesson7.Task2Clothes.Pants;

public class StagoPants implements Pants{
    public StagoPants() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел штаны Stago");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Stago");
    }
}

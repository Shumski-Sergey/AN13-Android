package asemiakin.lab7.task2.shoes;

public class NikeShoes implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Надета обувь от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята обувь от Nike");
    }
}

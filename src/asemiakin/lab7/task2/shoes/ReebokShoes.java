package asemiakin.lab7.task2.shoes;

public class ReebokShoes implements Shoes{
    @Override
    public void putOn() {
        System.out.println("Надета обувь от Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята обувь от Reebok");
    }
}

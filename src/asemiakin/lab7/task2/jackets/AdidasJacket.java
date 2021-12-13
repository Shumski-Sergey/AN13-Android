package asemiakin.lab7.task2.jackets;

public class AdidasJacket implements Jacket {
    @Override
    public void putOn() {
        System.out.println("Надета куртка от Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка от Adidas");
    }
}

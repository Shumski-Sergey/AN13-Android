package asemiakin.lab7.task2.jackets;

public class TNFJacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Надета куртка от The North Face");
    }

    @Override
    public void takeOff() {
        System.out.println("Снята куртка от The North Face");
    }
}

package nshekov.lesson7.Task2Clothes.Jacket;

public class ColambiaJacket implements Jacket{
    public ColambiaJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел куртку Colambia");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Colambia");
    }
}

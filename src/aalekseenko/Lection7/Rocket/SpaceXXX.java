package aalekseenko.Lection7.Rocket;

public class SpaceXXX implements IStart{
    @Override
    public boolean systemCheck() {
        int a = 0;
        int b = 10;
        int randomNumber = a + (int) (Math.random() * b);
        if (randomNumber > 3) { return true; }
        else { return false; }
    }
    @Override
    public void start() {
        System.out.println("Старт Шатла SpaceXXX");

    }
    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла SpaceXXX запущены. Все системы в норме.");


    }

}

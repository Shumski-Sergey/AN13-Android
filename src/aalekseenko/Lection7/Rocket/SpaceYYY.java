package aalekseenko.Lection7.Rocket;

public class SpaceYYY implements IStart{
    @Override
    public boolean systemCheck() {
        int a = 0;
        int b = 10;
        int randomNumber = a + (int) (Math.random() * b);
        if (randomNumber > 8) { return true; }
        else { return false; }
    }
    @Override
    public void start() {
        System.out.println("Старт Шатла SpaceYYY");

    }
    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла SpaceYYY запущены. Все системы в норме.");


    }
}

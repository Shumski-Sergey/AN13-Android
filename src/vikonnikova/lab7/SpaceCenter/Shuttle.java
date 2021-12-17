package vikonnikova.lab7.SpaceCenter;

public class Shuttle implements IStart {

    @Override
    public boolean prelaunchCheck() {
        int random = (int) (Math.random() * 10);
        System.out.println("Random = " + random);
        return random > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели шаттла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла");
    }
}

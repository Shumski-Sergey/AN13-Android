package npopov.Lab7.Spaceport;

public class Shuttle implements IStart {

    @Override
    public boolean systemСheck() {
        int random = (int) (Math.random() * 11);
        System.out.println("systemСheckRandom: " + random);
        return random > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void starting() {
        System.out.println("Старт Шатла");
    }
}

package nshekov.lesson7.Task3_Kosmolet;

public class Shuttle implements IStart{

    public Shuttle() {
    }

    @Override
    public boolean prestart() {
        int rand = (int) (Math.random() * 10);
        System.out.println("Random = " + rand);
        return rand > 3;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Шаттла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шаттла");
    }
}

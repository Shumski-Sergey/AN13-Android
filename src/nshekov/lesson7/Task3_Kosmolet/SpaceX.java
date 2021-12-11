package nshekov.lesson7.Task3_Kosmolet;

public class SpaceX implements IStart{

    public SpaceX() {
    }

    @Override
    public boolean prestart() {
        int rand = (int) (Math.random() * 10);
        System.out.println("Random = " + rand);
        return rand > 3;
    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}

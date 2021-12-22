package ibagritsevich.lection_7.Cosmodrome;

public class Shuttle implements IStart {

    private String name;

    public Shuttle(String name) {
        this.name = name;
    }

    public Shuttle(){}

    public String getName() {return name;}

    @Override
    public boolean PrelaunchCheck() {
        int a = 11;
        int random_number = (int)( Math.random() * a);
        return random_number > 3;
    }

    @Override
    public void EngineStarting() throws InterruptedException {
        int time = 10;
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
        for (int i = time; i >=0; i--) {
            System.out.println("Осталось: " + ((i > 0)? i : "менее секунды"));
            Thread.sleep(1000L);
        }
        System.out.println("Время истекло!");
    }

    @Override
    public void Start() {
        System.out.println("Старт Шатла " + getName());
    }
}

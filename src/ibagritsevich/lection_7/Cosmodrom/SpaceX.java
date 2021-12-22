package ibagritsevich.lection_7.Cosmodrom;

public class SpaceX implements IStart {

    private String name;
    private String pilot_name;

    public SpaceX(String name, String pilot_name) {
        this.name = name;
        this.pilot_name = pilot_name;
    }

    public SpaceX() {
    }

    public String getName() {
        return name;
    }

    public String getPilot_name() {
        return pilot_name;
    }

    @Override
    public boolean PrelaunchCheck() {
        int random_age = 18 + (int) (Math.random() * 33);
        return random_age < 35;
    }

    @Override
    public void EngineStarting() throws InterruptedException {
        int time = 10;
        System.out.println("Двигатели Ракеты запущены. Возраст пилота в норме.");
        for (int i = time; i >= 0; i--) {
            System.out.println("Осталось: " + ((i > 0) ? i : "менее секунды"));
            Thread.sleep(1000L);
        }
        System.out.println("Время истекло!");
    }

    @Override
    public void Start() {
        System.out.println("Старт Ракеты " + getName() + " с пилотом " + getPilot_name());
    }
}
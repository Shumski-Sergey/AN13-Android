package aalekseenko.Lection7.Rocket;

public class Cosmodrome{
    public IStart iStart;

    public Cosmodrome(IStart iStart) {
        this.iStart = iStart;

    }

    public void launch() throws InterruptedException {
        if (iStart.systemCheck()) {

            iStart.engineStart();

            long time = 10;
            for (int i = (int) time; i > 0; i--) {
                System.out.println("Осталось: " + i + " сек");
                Thread.sleep(1000L);
            }
            System.out.println("Отсчет завершен");

            iStart.start();
        }
        else { System.out.println("Предстартовая проверка провалена"); }

    }

}


package lkovsher.Rocket;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean prelaunchSystemCheck() {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        if(number > 3){
            return true;
        } else return false;
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }
}

package epavlyutin.pack7.cosmolet;

public class shuttle implements IStart{
    @Override
    public boolean preStart() {
        int random = (int) (Math.random() * 10);
        return random > 3;
    }

    @Override
    public void engineStarting() {
            System.out.println("Двигатели шатла запущены. \n Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт шатла!");
    }
}

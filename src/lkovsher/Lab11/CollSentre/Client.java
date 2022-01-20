package lkovsher.Lab11.CollSentre;

public class Client implements Runnable{

    private final CollSentre operator1 = new CollSentre(2);

    @Override
    public void run() {
        operator1.get();

    }
}

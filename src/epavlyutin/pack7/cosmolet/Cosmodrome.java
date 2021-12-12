package epavlyutin.pack7.cosmolet;

public class Cosmodrome {
    private IStart start;

    public Cosmodrome(IStart start) {
        this.start = start;
    }

    public void launch() {
        if (!start.preStart()) {
            System.out.println("Предстартовая проверка првалена");
        } else {
            start.engineStarting();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
            start.start();
        }
    }
}

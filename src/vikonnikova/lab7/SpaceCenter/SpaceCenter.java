package vikonnikova.lab7.SpaceCenter;


public class SpaceCenter {
    private IStart start;
    int i = 10;

    public SpaceCenter(IStart start) {
        this.start = start;
    }

    public void launch() throws InterruptedException {
        if (!start.prelaunchCheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else
            start.engineStart();
        while (i>0){
            System.out.println("Remaining: " + i +" seconds");
            try {
                i--;
                Thread.sleep(1000L);    // 1000L = 1000ms = 1 second
            }
            catch (InterruptedException e) {
               }
        }
                start.start();
            }
        }





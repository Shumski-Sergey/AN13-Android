package npopov.Lab7.Spaceport;

import java.io.IOException;

public class Cosmodrome {

    public void launch(IStart iStart) {
        if (iStart.systemСheck()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.startEngine();
            int count = 10;
            try {
                while (count > 0) {
                    System.out.println(count);
                    Thread.sleep(1000);
                    count--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            iStart.starting();
        }
    }

}

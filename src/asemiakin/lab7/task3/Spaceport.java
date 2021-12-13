package asemiakin.lab7.task3;

import java.util.concurrent.TimeUnit;

public class Spaceport {

    void launch(IStart iStart) throws InterruptedException {
        if (iStart.prelaunchSystemCheck()) {
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i + "...");
                TimeUnit.SECONDS.sleep(1);
            }
            iStart.generalStart();
        } else {
            System.out.println("Предстартовая проверка провалена.\n");
        }
    }

}

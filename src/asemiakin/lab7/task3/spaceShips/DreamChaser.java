package asemiakin.lab7.task3.spaceShips;

import asemiakin.lab7.task3.*;

public class DreamChaser implements IStart {

    @Override
    public void startEngine() {
        System.out.println("Двигатели «Dream Chaser» запущены.\n" + "Все системы в норме");
    }

    @Override
    public void generalStart() {
        System.out.println("Старт «Dream Chaser»!\n");
    }
}
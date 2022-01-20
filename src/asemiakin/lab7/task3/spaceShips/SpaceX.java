package asemiakin.lab7.task3.spaceShips;

import asemiakin.lab7.task3.*;

public class SpaceX implements IStart {

    @Override
    public void startEngine() {
        System.out.println("Двигатели «SpaceX» запущены.\n" + "Все системы в норме");
    }

    @Override
    public void generalStart() {
        System.out.println("Старт «SpaceX»!\n");
    }
}

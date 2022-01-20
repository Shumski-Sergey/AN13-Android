package asemiakin.lab7.task3;

import asemiakin.lab7.task3.spaceShips.DreamChaser;
import asemiakin.lab7.task3.spaceShips.SpaceShuttle;
import asemiakin.lab7.task3.spaceShips.SpaceX;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Spaceport spaceport = new Spaceport();
        spaceport.launch(new DreamChaser());
        spaceport.launch(new SpaceShuttle());
        spaceport.launch(new SpaceX());
    }
}

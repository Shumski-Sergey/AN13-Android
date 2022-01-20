package vikonnikova.lab7.SpaceCenter;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        SpaceCenter shuttle = new SpaceCenter(new Shuttle());
        SpaceCenter spaceX = new SpaceCenter (new SpaceX());
        System.out.println("Шаттл");
        shuttle.launch();
        System.out.println("SpaceX");
        spaceX.launch();
    }
}

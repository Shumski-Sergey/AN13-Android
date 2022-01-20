package epavlyutin.pack7.cosmolet;

public class Run {
    public static void main(String[] args) {
        Cosmodrome shuttle = new Cosmodrome(new shuttle());
        Cosmodrome spaceX = new Cosmodrome(new SpaceX());
        shuttle.launch();
        spaceX.launch();
    }
}

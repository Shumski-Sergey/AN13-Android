package nshekov.lesson7.Task3_Kosmolet;

public class TestCosmo {
    public static void main(String[] args) {
        Cosmodrome shuttle = new Cosmodrome(new Shuttle());
        Cosmodrome spaceX = new Cosmodrome(new SpaceX());
        shuttle.starting();
        spaceX.starting();
    }
}

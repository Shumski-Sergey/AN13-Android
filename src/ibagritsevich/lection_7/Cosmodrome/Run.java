package ibagritsevich.lection_7.Cosmodrome;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome shuttle = new  Cosmodrome(new Shuttle("T-4a"));
        Cosmodrome spacex = new Cosmodrome(new SpaceX("Falcon 9", "Тони"));
        shuttle.Starting();
        spacex.Starting();
    }
}
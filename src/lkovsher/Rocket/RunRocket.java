package lkovsher.Rocket;

public class RunRocket {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        cosmodrome.launch(shuttle);
    }
}

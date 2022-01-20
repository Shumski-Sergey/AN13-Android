package lkovsher.Lab11.Parking;


public class Running {
    public static void main(String[] args) {
        Auto auto = new Auto();

        Thread auto1 = new Thread(auto);
        Thread auto2 = new Thread(auto);
        Thread auto3 = new Thread(auto);
        auto1.start();
        auto2.start();
        auto3.start();
    }
}

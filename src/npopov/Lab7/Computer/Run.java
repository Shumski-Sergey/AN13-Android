package npopov.Lab7.Computer;

public class Run {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD", "DDR 4, 8 GB", "Toshiba, 1 TB", 2);
        computer.description();
        computer.inclusion();
    }
}

package aalekseenko.Lection7.Computer;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD", "Corsar", "Samsung", 1);
        computer.descriptionComputer();
        computer.turnOn();
        computer.turnOff();
        computer.turnOn();
        computer.turnOff();
        computer.computerBurnsOut();
    }
}

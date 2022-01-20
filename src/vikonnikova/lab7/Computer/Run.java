package vikonnikova.lab7.Computer;

public class Run {
    public static void main(String[] args) {
        Computer computer = new Computer("IntelI3", "SSD", 32, 10);
        computer.DisplayInfo();
        computer.TurnOn();
        computer.TurnOff();
        computer.LimitResourse();
    }
}

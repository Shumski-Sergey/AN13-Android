package nshekov.lesson11.CallCenter;

public class Client {
    private String name;
    private int timeWaiting;

    public Client(String name, int timeWaiting) {
        this.name = name;
        this.timeWaiting = timeWaiting;
    }

    public String getName() {
        return name;
    }

    public int getTimeWaiting() {
        return timeWaiting;
    }
}

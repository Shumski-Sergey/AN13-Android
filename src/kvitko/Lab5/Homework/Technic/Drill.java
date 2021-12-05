package kvitko.Lab5.Homework.Technic;

public class Drill extends ForBuilding {
    String item;
    String socket;

    public Drill(String TypeOfItem, String ForWhat, String item, String socket) {
        super(TypeOfItem, ForWhat);
        this.item = item;
        this.socket = socket;
    }

    public String getItem() {
        return item;
    }

    public String getSocket() {
        return socket;
    }
}

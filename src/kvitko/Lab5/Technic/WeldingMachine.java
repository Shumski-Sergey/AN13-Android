package kvitko.Lab5.Technic;

public class WeldingMachine extends ForBuilding {
    String item;
    String socket;

    public WeldingMachine(String TypeOfItem, String ForWhat, String item, String socket) {
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

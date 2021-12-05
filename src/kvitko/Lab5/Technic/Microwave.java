package kvitko.Lab5.Technic;

public class Microwave extends ForCooking {
    String item;
    String socket;

    public Microwave(String TypeOfItem, String ForWhat, String item, String socket) {
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

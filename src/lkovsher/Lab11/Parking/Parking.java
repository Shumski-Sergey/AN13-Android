package lkovsher.Lab11.Parking;

public class Parking {
    private int plaseNumber;
    private boolean plase;

    public Parking(int plaseNumber, boolean plase) {
        this.plaseNumber = plaseNumber;
        this.plase = plase;
    }

    public void setPlaseNumber(int plaseNumber) {
        this.plaseNumber = plaseNumber;
    }

    public void setPlase(boolean plase) {
        this.plase = plase;
    }

    public int getPlaseNumber() {
        return plaseNumber;
    }

    public boolean isPlase() {
        return plase;
    }
}

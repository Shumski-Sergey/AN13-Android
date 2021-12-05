package vikonnikova.lab5TaskA2;

public class Cards {
    private String owner;
    private int number;
    private String bank;

    public Cards(String owner, int number, String bank) {
        this.owner = owner;
        this.number = number;
        this.bank = bank;
    }

    public String getOwner() { return owner; }
    public int getNumber () { return number; }
    public String getbank() { return bank; }


    public void displayInfo() {

    }
}

package aalekseenko.Lection5.TaskA2;

public class Cards{
    protected String owner;
    protected String bank;

    public Cards(String owner, String bank) {
        this.owner = owner;
        this.bank = bank;
    }

    public String getOwner() { return owner; }
    public String getBank() { return bank; }

    public void displayInfo() {
        System.out.println("Информация о банковской карте: владелец - " + getOwner() + ", банк - " + getBank());
    }

}

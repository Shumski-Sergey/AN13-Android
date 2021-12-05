package vikonnikova.lab5TaskA2;

public class Debit extends Cards {
    String type;
    public String getType() { return (type); }

    public Debit(String name, int number, String bank, String type) {
        super(name, number, bank);
        this.type = type;
    }

    @Override
    public void displayInfo() {
    }

}

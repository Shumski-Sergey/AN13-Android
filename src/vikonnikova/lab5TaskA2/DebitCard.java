package vikonnikova.lab5TaskA2;

public class DebitCard extends Cards {
    String type;
    public String getType() { return (type); }

    public DebitCard(String name, int number, String bank, String type) {
        super(name, number, bank);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Владелец карты: " + getOwner() + "номер карты: " + getNumber() + "банк: " + getBank() + "тип: " + getType());
    }

}

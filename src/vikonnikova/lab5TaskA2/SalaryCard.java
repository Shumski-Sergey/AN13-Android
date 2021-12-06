package vikonnikova.lab5TaskA2;

public class SalaryCard extends DebitCard {
    public SalaryCard(String name, int number, String bank, String type) {

        super(name, number, bank, type);
    }

    public void displayInfo() {
        System.out.println("Владелец карты: " + getOwner() + "номер карты: " + getNumber() + "банк: " + getBank() + "тип: " + getType());
    }
}


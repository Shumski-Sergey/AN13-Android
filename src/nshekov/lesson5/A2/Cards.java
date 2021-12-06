package nshekov.lesson5.A2;

public class Cards {
    String bank;
    String type;
    int number;

    public Cards(String bank, String type, int number) {
        this.bank = bank;
        this.type = type;
        this.number = number;
    }

    public void displayInfo(){
        System.out.println("Карта: ".concat(this.type).concat("\nОбслуживается банком: ".concat(this.bank)));
    }
}

package npopov.Lab5.A1Lab5;

public class Washer extends BigAppliances {

    private String strLottery;

    Washer(String name, double price, int year, int weight) {
        super(name, price, year, weight);
    }

    public String getStrLottery() {
        return strLottery;
    }

    public String lottery() {
        int count = (int) (Math.random() * 2);
        strLottery = (count == 0) ? "Вы выиграли стиралку в лотерею :)" : "Вы не выиграли стиралку в лотерею :(";
        return strLottery;
    }
}

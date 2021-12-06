package nshekov.lesson5.A2;

public class Halva extends Cards{

    String credit;

    public Halva(String bank, String type, int number, String credit) {
        super(bank, type, number);
        this.credit = credit;
    }
}

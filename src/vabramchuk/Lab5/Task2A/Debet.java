package vabramchuk.Lab5.Task2A;

public class Debet extends Card_bank{
    String debet;

    public Debet(String card, String debet) {
        super(card);
        this.debet = debet;
    }

    public String getDebet() {
        return debet;
    }
}

package vabramchuk.Lab5.Task2A;

public class Kredit extends Card_bank{
    String kredit;

    public Kredit(String card, String kredit) {
        super(card);
        this.kredit = kredit;
    }

    public String getKredit() {
        return kredit;
    }
}

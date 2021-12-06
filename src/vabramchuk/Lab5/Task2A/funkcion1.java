package vabramchuk.Lab5.Task2A;

public class funkcion1 extends Kredit{
    String funkcion1;

    public funkcion1(String card, String kredit, String funkcion1) {
        super(card, kredit);
        this.funkcion1 = funkcion1;
    }

    public String getFunkcion1() {
        return funkcion1;
    }
    public void info1(){
        System.out.println("\n Банк:  " + getCard() + "\n Кредитная:  " + getKredit() + "\n Тип карты:  " + funkcion1);
    }
}

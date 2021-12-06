package vabramchuk.Lab5.Task2A;

public class funkcion2 extends Debet{
    String funkcion2;

    public funkcion2(String card, String debet, String funkcion2) {
        super(card, debet);
        this.funkcion2 = funkcion2;
    }

    public String getFunkcion2() {
        return funkcion2;
    }
    public void info2(){
        System.out.println("\n Банк:  " + getCard() + "\n Кредитная:  " + getDebet() + "\n Тип карты:  " + funkcion2);
    }
}

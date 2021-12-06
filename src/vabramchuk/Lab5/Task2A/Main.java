package vabramchuk.Lab5.Task2A;

public class Main {
    public static void main(String[] args) {
        funkcion1 Belarusbank = new funkcion1("Belarusbank", "Kridit_Card", "MasterCard");
        funkcion2 MTBank = new funkcion2("MTbank","Debit_Card","Visa");
        MTBank.info2();
        Belarusbank.info1();
    }
}

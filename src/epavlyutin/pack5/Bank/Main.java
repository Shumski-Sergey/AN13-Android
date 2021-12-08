package epavlyutin.pack5.Bank;

public class Main {
    public static void main(String[] args) {
        Currency currency = new Currency ("Альфа-Банк","Gold","Yahor Pauliutsin","7777 7777 7777 7777","usd");
        currency.info();
        currency.print();
    }

}

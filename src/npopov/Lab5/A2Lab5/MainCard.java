package npopov.Lab5.A2Lab5;

public class MainCard {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard("MTBank", "VISA", "7777 8888 9999 1111",
                "NIKOLAI", "POPOV");
        debitCard.print();
        System.out.println(debitCard.salary());
    }
}

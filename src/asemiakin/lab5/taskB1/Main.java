package asemiakin.lab5.taskB1;

public class Main {
    public static void main(String[] args) {
        char[] chars1 = new char[]{'4','3'};
        char[] chars2 = new char[]{'5','7'};
        Money money1 = new Money(21, chars1);
        Money money2 = new Money(3, chars2);
        Money.sum(money1, money2);
        Money.subtraction(money1,money2);
        Money.divide(money1,money2);
        Money.fractionalDivision(money1,3.3);
        Money.fractionalMultiplication(money1, 5.4);
        Money.comparison(money1, money2);
    }
}

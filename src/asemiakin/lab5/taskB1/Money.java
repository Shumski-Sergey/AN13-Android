package asemiakin.lab5.taskB1;

public class Money {
    private final long rubles;
    private final char[] penny;

    Money(long rubles, char[] penny) {
        this.rubles = rubles;
        this.penny = penny;
    }

    private double transformation(){
        return (double) this.rubles + Double.parseDouble("0." + String.valueOf(this.penny));
    }

    private static void showResult(double result, String operation){
        System.out.println("Результат операции " + operation + ": " + (Double.toString(result)).replace('.', ','));
    }

    static void sum(Money money1, Money money2){
        Money.showResult(money1.transformation() + money2.transformation(), "сложения сумм");
    }

    static void subtraction(Money money1, Money money2){
        Money.showResult(money1.transformation() - money2.transformation(), "вычитания сумм");
    }

    static void divide(Money money1, Money money2){
        Money.showResult(money1.transformation() / money2.transformation(), "деления между суммами");
    }

    static void fractionalDivision(Money money, double doubleNumber){
        Money.showResult(money.transformation() / doubleNumber, "деления суммы на дробное число");
    }

    static void fractionalMultiplication(Money money, double doubleNumber){
        Money.showResult(money.transformation() * doubleNumber, "умножения суммы на дробное число");
    }

    static void comparison(Money money1, Money money2){
        System.out.print("Результат операции сравнения: ");
        String number1 = (Double.toString(money1.transformation())).replace('.', ',');
        String number2 = (Double.toString(money2.transformation())).replace('.', ',');
        if (money1.transformation() < money2.transformation()){
            System.out.print(number1 + " < " + number2);
        }
        if (money1.transformation() > money2.transformation()){
            System.out.print(number1 + " > " + number2);
        }
        if (money1.transformation() == money2.transformation()){
            System.out.print(number1 + " = " + number2);
        }
    }
}

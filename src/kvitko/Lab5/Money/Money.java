package kvitko.Lab5.Money;
//Класс Деньги для работы с денежными суммами.
//Число должно быть представлено двумя полями: типа long для рублей и типа char - для копеек.
//Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой.
//Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число, умножение на дробное число и операции сравнения.
//В функции main проверить эти методы.

public class Money {
    long FirstPart;
    char[] SecondPart = new char[2];

    public Money(long FirstPart, char[] SecondPart) {
        this.FirstPart = FirstPart;
        this.SecondPart = SecondPart;
    }

    public long getFirstPart() {
        return FirstPart;
    }

    public char[] getSecondPart() {
        return SecondPart;
    }

    public void DisplayDigit() {
        System.out.println(FirstPart + "," + SecondPart);
    }

    public double Transform() {
        double YourNumber;
        int number1;
        String CharToString;
        CharToString = String.valueOf(SecondPart);
        number1 = Integer.parseInt(CharToString.trim());
        YourNumber = FirstPart + (double) number1 / 100;
        return YourNumber;
    }

    public double Sum(double YourNumber, double addnumber) {
        YourNumber += addnumber;
        return YourNumber;
    }

    public double Minus(double YourNumber, double addnumber) {
        YourNumber -= addnumber;
        return YourNumber;
    }

    public double Divide(double YourNumber, double addnumber) {
        YourNumber /= addnumber;
        return YourNumber;
    }

    public double Multiplication(double YourNumber, double addnumber) {
        YourNumber *= addnumber;
        return YourNumber;
    }

    public double Compare(double YourNumber, double addnumber) {
        if(YourNumber>addnumber) return YourNumber;
        else return addnumber;
    }
}

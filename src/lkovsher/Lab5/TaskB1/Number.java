package lkovsher.Lab5.TaskB1;

public class Number {
    long onePartNumber;
    char[] secondPartNumber = new char[2];

    public Number(long onePartNumber, char[] secondPartNumber) {
        this.onePartNumber = onePartNumber;
        this.secondPartNumber = secondPartNumber;
    }

    public long getOnePartNumber() {
        return onePartNumber;
    }

    public char[] getSecondPartNumber() {
        return secondPartNumber;
    }

    public double transfotmation(){
        double counter1;
        double number, counter2;
        counter1 = ((((int)secondPartNumber[0] - 48))*10 + ((int)secondPartNumber[1] - 48));
        counter2 = counter1/100;
        number = onePartNumber + counter2;
        System.out.println("Число: " + getOnePartNumber() + "," + this.secondPartNumber[0] + this.secondPartNumber[1]);
        return number;
    }

    double sum(double numberOne, double number){
        number = number + numberOne;
        return number;
    }

    double subtraction(double numberOne, double number){
        number = number - numberOne;
        return number;
    }

   double multiplication(double numberOne, double number){
        number = number*numberOne;
        return number;
    }

    double division(double numberOne, double number){
        number = number/numberOne;
        return number;
    }

    boolean comparison(double numberOne, double number){
        return (numberOne == number);
    }
}

package asemiakin.lab2;

public class TaskC2 {
    private static int sumDigitsInNumber(int number) {
        return ((number % 10) + (number/10 % 10) + (number/100 % 10) + (number/1000 % 10));
    }

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }
}

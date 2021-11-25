package kvitko.Lab2.Homework;

public class Lab2_task_c2 {
    public static int sumDigitsInNumber(int number){
        int sum=number%10+number%100/10+number%1000/100+number/1000;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5467));
    }
}

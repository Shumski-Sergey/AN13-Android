package aalekseenko.Lection2;

import java.util.Scanner;

public class TaskC2 {
    private static int SumDigitsInNumber(int Number){
        int a1 = Number%10;
        Number = (int)Math.floor(Number/10);
        int a2 = Number%10;
        Number = (int)Math.floor(Number/10);
        int a3 = Number%10;
        Number = (int)Math.floor(Number/10);
        int a4 = Number%10;
        return (a4+a3+a2+a1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = SumDigitsInNumber(sc.nextInt());
        System.out.println(sum);

    }
}

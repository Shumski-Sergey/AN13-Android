package vikonnikova.lab3;

import java.util.Scanner;

public class lab3BTask1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int number = sc.nextInt();
        int result = 1;
        int i = 0;
        for (i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}

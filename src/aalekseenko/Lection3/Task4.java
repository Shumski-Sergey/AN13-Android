package aalekseenko.Lection3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Digital = sc.nextInt();
        long Factorial = 1L;
        for(int i = 2; i < (Digital+1); i++){
            Factorial = Factorial*i;
        }
        System.out.println(Factorial);
    }
}

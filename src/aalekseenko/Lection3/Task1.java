package aalekseenko.Lection3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int Digital = sc.nextInt();
        while(Digital > 0){
            sum+=Digital%10;
            Digital = (int)Math.floor(Digital/10);
        }
        System.out.println(sum);


    }
}

package nshekov.dopTask;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter three of your numbers:");
        Scanner sc = new Scanner(System.in);
        int counter=0;
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            if (sc.nextInt() > 0)
                counter++;
        }
        System.out.println(counter);
    }
}

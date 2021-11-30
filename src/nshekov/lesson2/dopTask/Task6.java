package nshekov.lesson2.dopTask;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Enter your two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is bigger");
        } else if (a < b){
            System.out.println(b + " is bigger");
        } else if (a == b){
            System.out.println("Numbers are equal");
        }
    }
}

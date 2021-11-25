package kvitko.Lab2.Homework.Additional_tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a= scanner.nextInt();
        if(a>0) a++;
        else if (a==0) a=10;
        else a-=2;
        System.out.println("Your current number is "+a);
    }
}

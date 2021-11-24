package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class Tsk1 {

    public static void checkNum(int n){
        if(n>0){
            System.out.println("positive number!");
        } else if(n<0){
            System.out.println("negative number!");
        }
    }

    public static void countNum(int n){
        int count=0;
        int number=n;
        while((n/=10)!=0){
            count++;
        }
        switch(count){
            case 0:
                System.out.print("One-digit ");
                checkNum(number);
                break;
            case 1:
                System.out.print("Two-digit ");
                checkNum(number);
                break;
            case 2:
                System.out.print("Three-digit ");
                checkNum(number);
                break;
            case 3:
                System.out.println("Four-digit ");
                checkNum(number);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= scanner.nextInt();
        if(n==0){
            System.out.println("Number is null!");
            return ;
        }
        countNum(n);
    }
}

package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class Tsk2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter values a,b,c(by space): ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        if(a+b>c && a+c>b && c+b>a){
            System.out.println("Triangle exist!");
        } else System.out.println("Triangle doesn't exist!");
    }
}

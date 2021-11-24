package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class Tsk5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter three values(by space): ");
        int num1= scanner.nextInt();
        int num2=scanner.nextInt();
        int num3= scanner.nextInt();
        int positiveCount=0,negativeCount=0;
        if(num1>0) {
            positiveCount++;
        } else if(num1<0) negativeCount++;
        if(num2>0) {
            positiveCount++;
        } else if(num2<0) negativeCount++;
        if(num3>0) {
            positiveCount++;
        } else if(num3<0) negativeCount++;
        System.out.println("Number of positive values: "+positiveCount+
                "\nNumber of negative values: "+negativeCount);
    }
}


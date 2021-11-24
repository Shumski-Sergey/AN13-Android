package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class Tsk3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int number= scanner.nextInt();
        if(number>0) number++;
        if(number<0) number-=2;
        if(number==0) number=10;
        System.out.println("Number after check: "+number);
    }
}

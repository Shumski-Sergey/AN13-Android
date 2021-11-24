package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class Tsk6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter two values: ");
        int value1= scanner.nextInt();
        int value2= scanner.nextInt();
        if(value1==value2)  System.out.println("Value 1 equal value 2");
        if(value1>value2) System.out.println("Value 1 greatest than value 2");
        if(value1<value2) System.out.println("Value 2 greatest than value 1");
    }
}

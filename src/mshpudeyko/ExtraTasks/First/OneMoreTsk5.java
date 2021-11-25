package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class OneMoreTsk5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value= scanner.nextInt();
        if(value<=0){
            System.out.println("Число не является натуральным");
            return;
        }
        if(value==1){
            System.out.println("Для числа 1 невозможно посчитать делители");
        }
        System.out.print("Делители натурального числа "+value+": ");
        for(int i=1;i<=value;i++){
            if((value/i)*i==value) System.out.print(i+" ");
        }
    }
}

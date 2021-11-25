package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;

public class OneMoreTsk4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value= scanner.nextInt();
        int res=1;
        for(int i=1;i<=value;i++){
            res*=i;
        }
        System.out.println("Factorial: "+res);
    }
}

package mshpudeyko.ExtraTasks.First;
import java.util.Scanner;
public class OneMoreTsk2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= scanner.nextInt();
        if(number==0 || number==1){
            System.out.println("Число "+number+" не является ни простым, ни составным");
            return;
        }
        int count=0;
        for(int i=2;i<=number;i++){
            if(number%i==0) count++;
        }
        if(count==1) System.out.println("Число "+number+" является простым");
        else System.out.println("Число "+number+ " является составным");
    }
}

package mshpudeyko.Practice1.TaskB;
import java.util.Scanner;

public class FirstTaskB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the values a,b,c (by space): ");
        int a=scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int disсriminant=b*b-4*a*c;
        if(disсriminant>0){
            System.out.println("The equation has two roots");
            double x1,x2;
            double sq=Math.sqrt(disсriminant);
           x1=(double)(-b+sq)/(2*a);
           x2=(double)(-b-sq)/(2*a);
            System.out.println("Roots: "+x1+" "+x2);
        } else if(disсriminant==0){
            System.out.println("The equation has one root: ");
            double x=(double)(-b)/(2*a);
            System.out.println("Root: "+x);
        } else if(disсriminant<0){
            System.out.println("Negative discriminant!");
        }
    }
}

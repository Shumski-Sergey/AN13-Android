package mkornilkov.lesson2;

import java.util.Scanner;

public class task1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        {System.out.println("Введите целое число A");}
        int a = sc.nextInt();
        {System.out.println("Введите целое число B");}
        int b = sc.nextInt();
        {System.out.print ("a+b="+(a+b));}
        {System.out.print (" a-b="+(a-b));}
        {System.out.print (" a*b="+(a*b));}
        {System.out.print (" a/b="+(a/b));}
        {System.out.println (" a%b="+(a%b));}

        {System.out.print ("a+b="+(double)(a+b));}
        {System.out.print (" a-b="+(double)(a-b));}
        {System.out.print (" a*b="+(double)(a*b));}
        {System.out.print (" a/b="+(double)(a/b));}
        {System.out.println (" a%b="+(double)(a%b));}
    }
}

package mshpudeyko.Practice1.TaskA;

import java.util.Scanner;


public class FirstTaskA {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a: " );
        int a=scanner.nextInt();
        System.out.print("Enter b: " );
        int b=scanner.nextInt();
        System.out.println("Hello world");
        int res;
        res=a+b;
        System.out.print("Sum "+res+"\t");
        res=a-b;
        System.out.print("Dif "+res+"\t");
        res=a*b;
        System.out.print("Prod "+res+"\t");
        res=a/b;
        System.out.print("Chas "+res+"\t");
        res=a%b;
        System.out.println("Ost "+res+"\t");

        double SecondRes=a+b;
        System.out.print("Sum "+SecondRes+"\t");
        SecondRes=a-b;
        System.out.print("Dif "+SecondRes+"\t");
        SecondRes=a*b;
        System.out.print("Prod "+SecondRes+"\t");
        SecondRes=a/b;
        System.out.print("Chas "+SecondRes+"\t");
        SecondRes=a%b;
        System.out.print("Ost "+SecondRes+"\t");

    }
}

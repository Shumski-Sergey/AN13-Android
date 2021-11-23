package kvitko;

import java.util.Scanner;

public  class Lab2 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a: ");
                int a = scanner.nextInt();
                System.out.print("Enter b: ");
                int b = scanner.nextInt();
                System.out.println(a+b+" "+(a-b)+" "+a*b+" "+a/b+" "+a%b);
                System.out.print((double)a+b+" "+(double)(a-b)+" "+(double)a*b+" "+(double)a/b+" "+(double)a%b);
        }

}


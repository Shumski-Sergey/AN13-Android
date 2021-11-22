package kvitko;


import java.util.Scanner;

public  class Lab2 {
        public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a: ");
                int a = scanner.nextInt();
                System.out.print("Enter b: ");
                int b = scanner.nextInt();
                System.out.print(a+b+" ");
                System.out.print(a-b+" ");
                System.out.print(a*b+" ");
                System.out.print(a/b+" ");
                System.out.println(a%b+" ");

                System.out.print((double) a+b+" ");
                System.out.print((double)a-b+" ");
                System.out.print((double)a*b+" ");
                System.out.print((double)a/b+" ");
                System.out.print((double)a%b+" ");

        }

}


package kvitko.Lab3.Practic;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum=0, ostatok;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число: ");
        int a= scanner.nextInt();
        while (a!=0){
            ostatok=a%10;
            if(ostatok==0) break;
            a/=10;
            sum+=ostatok;
        }
        System.out.println("Сумма цифр: "+sum);
    }
}

package mshpudeyko.Practice3.String;
import java.lang.String;
import java.util.Scanner;
/*
*  Ввести n строк с консоли,
* найти самую короткую и самую длинную строки.
* Вывести найденные строки и их длину.
* */
public class Tsk1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int number=scanner.nextInt();
        System.out.print("Enter first string: ");
        String maxStr=scanner.next();;
        String minStr=maxStr;
        for(int i=1;i<number;i++){
            System.out.print("String № "+(i+1)+" : ");
            String next=scanner.next();
            if (maxStr.length() < next.length()) {
                maxStr = next;
            } else if (minStr.length() > next.length()) {
                minStr = next;
            }
        }
        System.out.println("MaxLine = ".concat(maxStr));
        System.out.print("MinLine = ".concat(minStr));
    }
}

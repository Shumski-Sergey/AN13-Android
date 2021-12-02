package mshpudeyko.Practice3.String;
import java.lang.String;
import java.util.Scanner;
/*
*  Ввести n строк с консоли.
*  Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
* */
public class Tsk3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int number= scanner.nextInt();

        String[] strings = new String[number];
        int sum=0;
        for (int i = 0; i < number; i++) {
            System.out.print("Enter string № " + (i + 1) + " : ");
            strings[i] = scanner.next();
            sum+=strings[i].length();
        }
        int midSum=sum/number;
        System.out.println("The length of the string is less than the average:");
        for(int i=0;i<number;i++){
            if(strings[i].length()<midSum){
                System.out.print("Strings["+i+"]="+strings[i]+" ");
            }
        }
        System.out.println("\nThe length of the string is longer than the average:");
        for(int i=0;i<number;i++){
            if(strings[i].length()>=midSum){
                System.out.print("Strings["+i+"]="+strings[i]+" ");
            }
        }
    }
}
